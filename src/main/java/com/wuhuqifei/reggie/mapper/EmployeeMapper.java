package com.wuhuqifei.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuhuqifei.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * 员工的映射
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
