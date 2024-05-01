package com.springframwork.mysql1.Mysql1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load the Spring application context XML file
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        // Retrieve the MysqlBean from the context
        MysqlBean mysqlBean = (MysqlBean) context.getBean("mysqlBean");
                                                                        
        // Display the MySQL connection properties
        System.out.println("MySQL Connection Properties:");
        System.out.println("URL: " + mysqlBean.getUrl());
        System.out.println("Username: " + mysqlBean.getUsername());
        System.out.println("Password: " + mysqlBean.getPassword());
    }
}