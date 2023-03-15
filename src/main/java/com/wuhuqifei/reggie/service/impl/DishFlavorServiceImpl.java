package com.wuhuqifei.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuhuqifei.reggie.entity.DishFlavor;
import com.wuhuqifei.reggie.mapper.DishFlavorMapper;
import com.wuhuqifei.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

/**
 * 菜品口味的service
 */
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
