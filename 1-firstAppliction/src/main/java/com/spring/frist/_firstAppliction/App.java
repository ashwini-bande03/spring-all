package com.spring.frist._firstAppliction;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("springconfig.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Beanclass myBean = (Beanclass) factory.getBean("add");
		myBean.printAddition();

	}
}
