package com.spring.seven._seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
 public static void main(String[] args) {
 
 @SuppressWarnings("resource")
ApplicationContext context = new  ClassPathXmlApplicationContext("spconfig.xml");
 AmeerpetTechnologies studBean = (AmeerpetTechnologies) context.getBean("stu");
 studBean.print();
    }
}
