package com.wuhuqifei.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuhuqifei.reggie.entity.OrderDetail;
import com.wuhuqifei.reggie.mapper.OrderDetailMapper;
import com.wuhuqifei.reggie.service.OrderDetailService;
import com.wuhuqifei.reggie.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * 订单明细的service
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
