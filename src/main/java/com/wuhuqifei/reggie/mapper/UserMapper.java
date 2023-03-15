package com.wuhuqifei.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuhuqifei.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户的映射
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
