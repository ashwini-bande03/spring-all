package com.spring.javaconfigration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {
	@Bean
	public studentBean getBean() {
		studentBean bean = new studentBean();
		bean.setId(1);
		bean.setName("Ashu");
		return bean;
		
		
	}

}
