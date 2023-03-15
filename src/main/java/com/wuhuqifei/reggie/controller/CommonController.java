package com.wuhuqifei.reggie.controller;

import com.wuhuqifei.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/common")
@Slf4j
public class CommonController {

    @Value("${reggie.path}")
    private String basePath;  // 读取配置文件中图片转存位置

    /**
     * 文件上传
     *
     * @param file 这里变量名要和前端标签中name属性的值一致
     * @return
     */
    @PostMapping("/upload")
    public R<String> upload(MultipartFile file) {
        // 这时候file是一个临时文件，需要转存到指定位置，否则本次请求完成后临时文件会删除

        // 获取原始文件名，主要是要拿后缀
        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        // 使用UUID重新生成文件名，防止文件名称重复造成文件覆盖
        String fileName = UUID.randomUUID().toString() + suffix;

        // 创建目录对象，当basePath路径不存在的时候会自动创建
        File dir = new File(basePath);
        // 判断该目录是否存在
        if (!dir.exists()) {
            // 目录不存在，需要创建
            dir.mkdirs();
        }

        // 将临时文件转存到指定位置
        try {
            file.transferTo(new File(basePath + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 需要返回文件名，等到前端保存然后再将文件名存到数据库
        return R.success(fileName);
    }

    /**
     * 文件下载
     *
     * @param name
     * @param response
     */
    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) {
        try {
            // 输入流，通过输入流读取文件内容
            FileInputStream fileInputStream = new FileInputStream(new File(basePath + name));
            // 输出流，通过输出流将文件写回浏览器，在浏览器展示图片
            ServletOutputStream outputStream = response.getOutputStream();

            response.setContentType("image/jpeg");

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes,0,len);
                outputStream.flush();
            }

            // 关闭资源
            outputStream.close();
            fileInputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
