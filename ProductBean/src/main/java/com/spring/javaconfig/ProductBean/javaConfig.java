package com.spring.javaconfig.ProductBean;


import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class javaConfig {
	@Bean
	public ProductBean getProduct() {
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter your id:");
		int id =scan.nextInt();
		System.out.println("enter your name:");
		String name = scan.next();
		System.out.println("enter your quantity:");
		int quntity = scan.nextInt();
		System.out.println("enter your price:");
		
		double price = scan.nextDouble();
		ProductBean prod = new ProductBean(id,name,quntity,price);
		return prod;	
	}

}
