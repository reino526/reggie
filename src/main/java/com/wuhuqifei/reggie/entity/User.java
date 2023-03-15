package com.wuhuqifei.reggie.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息实体类
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1l;

    private Long id;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

    private String avatar;

    private Integer status;

}
