package com.injections.DependencyInjection;

import com.injection.DependencyInjection.Product;

public class App {
	
	    public static void main(String[] args) {
	        // Create a Product instance using the constructor
	        Product product1 = new Product(101, "1+mobile", 4000, 1);

	        // Print product details
	        System.out.println("Product ID: " + product1.getpId());
	        System.out.println("Product Name: " + product1.getpName());
	        System.out.println("Product Price: " + product1.getPrice());
	        System.out.println("Product Quantity: " + product1.getQuantity());

	        // Update product details using setter methods
	        product1.setPrice(4500);
	        product1.setQuantity(2);

	        // Print updated product details
	        System.out.println("\nUpdated Product Price: " + product1.getPrice());
	        System.out.println("Updated Product Quantity: " + product1.getQuantity());
	    }
	}