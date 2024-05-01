package com.spring.jdbc.DAO;

import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

    	@SuppressWarnings("unused")
		Beanclass bn = (Beanclass)context.getBean("jdbcId");
        
    }
}
