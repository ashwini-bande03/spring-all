package com.spring.Annotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Annotation {
	@Value("1")
	private int empId;
	@Value("Ashu")
	private String name;
	@Value("7000")
	private int salary;
	@Value("20")
	private double price;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Annotation(int empId, String name, int salary, double price) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.price = price;
	}
	public Annotation() {
		
	}
	public void display() {
		System.out.println("Empolyee id:"+"1234");
		System.out.println("Empolyee:"+"Ashu");
		System.out.println("Employee:"+"70000");
		System.out.println("Employee:"+"20");
		
	}

}
