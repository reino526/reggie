package com.wuhuqifei.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuhuqifei.reggie.entity.ShoppingCart;
import com.wuhuqifei.reggie.mapper.ShoppingCartMapper;
import com.wuhuqifei.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * 购物车的service
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
