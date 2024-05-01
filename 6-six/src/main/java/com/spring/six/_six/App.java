package com.spring.six._six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
 public static void main(String[] args) {
 
 @SuppressWarnings("resource")
ApplicationContext context = new  ClassPathXmlApplicationContext("spconfig.xml");
 Ameerpet studBean = (Ameerpet) context.getBean("stu");
 studBean.printStudentRollNumbers();
    }
}
