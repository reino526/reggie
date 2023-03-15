package com.wuhuqifei.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuhuqifei.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分类的映射
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
