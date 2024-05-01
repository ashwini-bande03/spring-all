package com.spring.third.Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        ProductBean bc = (ProductBean) context.getBean("productBean");
        ((ProductBean) bc).display();
    }
}
