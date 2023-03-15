package com.wuhuqifei.reggie.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 地址簿实体类
 */
@Data
public class AddressBook implements Serializable {

    private static final long serialVersionUID = 1l;

    private Long id;

    private Long userId;

    private String consignee;

    private String phone;

    private String sex;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String districtCode;

    private String districtName;

    private String detail;

    private String label;

    private Integer isDefault;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE) // 公共字段填充
    private LocalDateTime updateTime;

    @TableField(fill = FieldFill.INSERT) // 这个注解指定自动填充的策略，然后编写一个实现MetaObjectHandler接口的类就可以实现
    private Long createUser;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;

    private Integer isDeleted;
}
