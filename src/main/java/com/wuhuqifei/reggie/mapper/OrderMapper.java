package com.wuhuqifei.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuhuqifei.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单的映射
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders>  {
}
