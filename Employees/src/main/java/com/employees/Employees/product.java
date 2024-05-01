package com.employees.Employees;


import java.util.Scanner;

public class product{
    private int id;
    private String name;
    private String quality;
    private double price;

    public void Item(int id, String name, String quality, double price) {
        this.id = id;
        this.name = name;
        this.quality = quality;
        this.price = price;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Quality: " + quality + ", Price: $" + price;
    }

    @SuppressWarnings("null")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        product[] product = null;
		for (int i = 0; i < numItems; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");
            System.out.print("ID: ");
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            System.out.print("Quality: ");
            System.out.print("Price: $");
            scanner.nextLine(); // Consume newline

            product[i] = new product();
        }

        System.out.println("\nItems Entered:");
        for (product item : product) {
            System.out.println(item);
        }

        scanner.close();
    }
}