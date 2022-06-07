package org.github.mybatis.service.Impl;

import org.github.mybatis.bean.Employee;
import org.github.mybatis.mapper.EmployeeMapper;
import org.github.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.findAllEmployee();
    }
}