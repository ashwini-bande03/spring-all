package com.spring.Eigth._Eigth;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
 public static void main(String[] args) {
 
 @SuppressWarnings("resource")
ApplicationContext context = new  ClassPathXmlApplicationContext("spconfig.xml");
 AmeerpetBean studBean = (AmeerpetBean) context.getBean("stu");
 studBean.print();
    }
}

