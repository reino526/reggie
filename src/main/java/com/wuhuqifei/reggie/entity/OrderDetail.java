package com.wuhuqifei.reggie.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单明细实体类
 */
@Data
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1l;

    private Long id;

    private String name;

    private Long orderId;

    private Long dishId;

    private Long setmealId;

    private String dishFlavor;

    private Integer number;

    private BigDecimal amount;

    private String image;
}
