package com.wuhuqifei.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuhuqifei.reggie.entity.Employee;
import com.wuhuqifei.reggie.mapper.EmployeeMapper;
import com.wuhuqifei.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * 员工的service
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
