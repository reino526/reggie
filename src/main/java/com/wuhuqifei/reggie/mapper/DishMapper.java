package com.wuhuqifei.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuhuqifei.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜品的映射
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
