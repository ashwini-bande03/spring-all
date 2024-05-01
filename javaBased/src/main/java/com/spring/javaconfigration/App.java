package com.spring.javaconfigration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    
    {
    	
    	@SuppressWarnings("resource")
    	ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
		studentBean bc = (studentBean )context.getBean("getBean");
       bc.display();
    }
}
