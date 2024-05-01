package com.spring.frist._first;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class App {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("springcofing.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Addition myBean = (Addition) factory.getBean("add");
		myBean.printAddition();


	}
}