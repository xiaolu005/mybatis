package org.github.mybatis.mapper;

import org.github.mybatis.bean.Employee;

import java.util.List;

public interface EmployeeMapper {

    public Employee findEmployeeById(Integer id);
    public List<Employee> findAllEmployee();
    public int updateEmployee(Employee emp);
    public int insertEmployee(Employee emp);
    public int deleteEmployee(Integer id);
}
