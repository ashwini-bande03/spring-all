package com.spring.third.Dependency;

public class OrderBean {
	private int orderId;
	private ProductBean product;
	
	public OrderBean(int id) {
		this.orderId=id;
	}
	public OrderBean(ProductBean product) {
		this.product=product;
	}
	
	public void setOrderId(int id) {
		this.orderId=id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setProduct(ProductBean product) {
		this.product=product;
	}
	public ProductBean getProduct() {
		return product;
	}
	
	public void  print() {
		System.out.println(orderId);
		System.out.println("product details:" +product.getProductId());
		System.out.println(product.getProductName());
		System.out.println(product.getProductName());
		System.out.println(product.getProductName());
	}
}
