package com.spring.model;

public class Model {
	private String name;
	private String variant;
	private double price;
	public String getname() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getvariant() {
		return variant;
	}
	public void setvariant(String variant) {
		this.variant=variant;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public Model() {
		super();
	}
	public void start() {
		System.out.println("car started...");
		System.out.println("name::"+name+"variant::"+variant);
	}

}
