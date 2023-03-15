package com.wuhuqifei.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuhuqifei.reggie.entity.SetmealDish;
import com.wuhuqifei.reggie.mapper.SetmealDishMapper;
import com.wuhuqifei.reggie.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 套餐和菜品关系的service
 */
@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
