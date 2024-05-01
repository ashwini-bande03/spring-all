package com.spring.Annotationbased;

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
		ApplicationContext context = new AnnotationConfigApplicationContext(Annotation.class);
    	Annotation sb = (Annotation)context.getBean(Annotation.class);
        sb.display();
        
    }
}
