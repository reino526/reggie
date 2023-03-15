package com.wuhuqifei.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wuhuqifei.reggie.dto.SetmealDto;
import com.wuhuqifei.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    // 新增套餐，同时需要保存套餐和菜品的关联关系
    public void saveWithDish(SetmealDto setmealDto);

    // 删除套餐，同时删除套餐和菜品的关联数据
    public void removeWithDish(List<Long> ids);
}
