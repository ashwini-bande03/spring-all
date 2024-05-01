package com.spring.model;

public class Car {
    private Model model;

    // Setter injection
    public void setModel(Model model) {
        this.model = model;
        System.out.println("Called setter method..");
    }

    // Constructor injection
    public Car(Model model) {
        super();
        this.model = model;
        System.out.println("Called car constructor..");
    }

    // Default constructor
    public Car() {
        super();
    }

    public void carStarted() {
        if(model != null) {
            model.start();
        } else {
            System.out.println("Car not started");
        }
    }
}