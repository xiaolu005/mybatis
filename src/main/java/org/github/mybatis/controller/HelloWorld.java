package org.github.mybatis.controller;


import org.github.mybatis.bean.Employee;
import org.github.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HelloWorld {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        List<Employee> allEmployee = employeeService.getAllEmployee();
        model.addAttribute("list",allEmployee);

        return "empList";
    }

}