package com.wuhuqifei.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuhuqifei.reggie.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

/**
 * 购物车的映射
 */
@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
}
