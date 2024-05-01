package com.spring.five._five;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
 public static void main(String[] args) {
 
 @SuppressWarnings("resource")
ApplicationContext context = new  ClassPathXmlApplicationContext("springconfig.xml");
 AmeerpetTechnologiesBean studBean = (AmeerpetTechnologiesBean) context.getBean("institute");
 studBean.print();
 }
}