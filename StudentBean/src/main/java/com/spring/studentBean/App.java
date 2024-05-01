package com.spring.studentBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration @Component ("com.spring")

public class App 
{
	
    public static void main( String[] args )
    {                
    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(studentBean.class);
    	studentBean sb = (studentBean)context.getBean(studentBean.class);
        sb.display();
    }
}

