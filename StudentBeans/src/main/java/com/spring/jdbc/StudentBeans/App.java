package com.spring.jdbc.StudentBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

    	@SuppressWarnings("unused")
		studentBean st = (studentBean)context.getBean("jdbcId");
    	studentBean.insert();
    	studentBean.delete();
    	studentBean.getoneRecord();
        
    }
}
