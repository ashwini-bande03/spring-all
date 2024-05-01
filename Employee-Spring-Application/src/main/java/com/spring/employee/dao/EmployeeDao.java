package com.spring.employee.dao;

import java.util.List;

import com.spring.employee.EmployeeBean;

public interface EmployeeDao {

    int saveEmployee(EmployeeBean employeeBean);

    void deleteEmployee(int id);

    List<EmployeeBean> employeeAll();

    EmployeeBean viewEmployeeOne(int id);

    void updateEmployee(EmployeeBean employeeBean);
    
}