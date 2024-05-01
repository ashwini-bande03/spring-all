package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.employee.dao.EmployeeDaoImp;

public class App {

    public static void main(String[] args) {
        
    	
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        
        EmployeeDaoImp employeeDao = (EmployeeDaoImp) context.getBean("employeeDao");

        
        EmployeeBean newEmployee = new EmployeeBean();
        newEmployee.setName("John Doe");
        newEmployee.setDepartment("IT");

        
        int savedEmployeeId = employeeDao.saveEmployee(newEmployee);
        System.out.println("New employee saved with ID: " + savedEmployeeId);

       
        EmployeeBean retrievedEmployee = employeeDao.viewEmployeeOne(savedEmployeeId);
        System.out.println("Retrieved employee: " + retrievedEmployee);

        
        retrievedEmployee.setDepartment("Finance");
        employeeDao.updateEmployee(retrievedEmployee);
        System.out.println("Employee updated successfully");

       
        System.out.println("All employees:");
        for (EmployeeBean employee : employeeDao.employeeAll()) {
            System.out.println(employee);
        }

        
        employeeDao.deleteEmployee(savedEmployeeId);
        System.out.println("Employee deleted successfully");
    }
}