package com.spring.jdbc.UserBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    	UserBean user = (UserBean)context.getBean("jdbcBeanClass");
    	user.create();
    	user.insert();
    	user.updateUser();
    	user.deleteUser();
    	user.getOneRecord();
    	user.allRecord();

    }
}
