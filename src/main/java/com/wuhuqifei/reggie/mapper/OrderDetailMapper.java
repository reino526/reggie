package com.wuhuqifei.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuhuqifei.reggie.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单明细的映射
 */
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {
}
