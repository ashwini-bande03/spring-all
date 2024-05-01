package com.spring.javaconfig.Dependencys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {

	
	@Bean
    public Employee getBean() {
        Employee bean = new Employee();
        bean.setId(1);
        bean.setName("Ashu");
        
       
        Address ad = new  Address ();
        ad.setCity("Hyd");
        ad.setColony("Ashu");
        ad.setPincode(1234);
        
        
        bean.setAddres(ad);
        
        return bean; 
    }
}