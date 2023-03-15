package com.wuhuqifei.reggie.dto;

import com.wuhuqifei.reggie.entity.Setmeal;
import com.wuhuqifei.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;

}
