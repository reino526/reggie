package com.wuhuqifei.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuhuqifei.reggie.entity.User;
import com.wuhuqifei.reggie.mapper.UserMapper;
import com.wuhuqifei.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户的service
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
