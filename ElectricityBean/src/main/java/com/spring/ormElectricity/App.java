package com.spring.ormElectricity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");

       
        ElectricityBean elc = (ElectricityBean) ctx.getBean("electricityBean");

        
        int currentReading = elc.getCurrentReading();
        int previousReading = elc.getPreviousReading();
        double electricityCost = calculateElectricityCost(currentReading, previousReading);

        
        System.out.println("Electricity cost: $" + electricityCost);
    }

   
    private static double calculateElectricityCost(int currentReading, int previousReading) {
        
        int unitsConsumed = currentReading - previousReading;
        double costPerUnit = 0.15; 
        return unitsConsumed * costPerUnit;
    }
}