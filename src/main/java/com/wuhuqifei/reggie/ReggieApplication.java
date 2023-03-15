package com.wuhuqifei.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * SpringBoot启动类
 */
@Slf4j // 加了这个注释以后可以直接使用log输出日志
@ServletComponentScan // 加这个注释才会去扫描WebFilter那些注释
@EnableCaching // 开启Spring Cache注解方式的缓存功能
@SpringBootApplication
@EnableTransactionManagement
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功...");
    }
}
