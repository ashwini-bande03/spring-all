package com.spring.second._second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.second._second.stundent.Student;

/*import org.springframework.beans.fac=-tory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;*/

public class App {
	public static <StudentBean> void main(String[] args) {
		/*Resource res = new ClassPathResource("spconfig.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Employee myBean = (Employee) factory.getBean("Emp");
		myBean.print();*/
		
		/*Resource res = new FileSystemResource("C:\\Users\\bande\\OneDrive\\Desktop\\New folder (2)\\springconfigration.xml.txt\"");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Employee myBean = (Employee) factory.getBean("Emp");
		myBean.print();*/
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		Student myBean=(Student)ctx.getBean("student");
		System.out.println(myBean);
		myBean.printStudent();
		
	}

	
}