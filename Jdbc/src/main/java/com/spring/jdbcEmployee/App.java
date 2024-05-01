package com.spring.jdbcEmployee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings({ "resource" })
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    	EmployeeBean eb=(EmployeeBean)context.getBean("EmpBean");
    	eb.create();
    	eb.insert();
    	eb.delete();
    	eb.getAll();
    }
}
 