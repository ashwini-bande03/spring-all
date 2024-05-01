package com.spconfig.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
 public static void main(String[] args) {
 
 ApplicationContext context = new  ClassPathXmlApplicationContext("spconfig.xml");
 StudentBean studBean = (StudentBean) context.getBean("student");
 studBean.print();
 }
}
