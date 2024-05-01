package com.injection.DependencyInjection;

public class Product {

    private int pId;
    private String pName;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pId, String pName, double price, int quantity) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.quantity = quantity;
    }

    // Setter methods
    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter methods
    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}