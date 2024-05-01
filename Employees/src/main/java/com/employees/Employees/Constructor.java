package com.employees.Employees;

public class Constructor {
    int empId;
    String empName;
    String course;

    public Constructor(int empId, String empName, String course) {
        this.empId = empId;
        this.empName = empName;
        this.course = course;
    }

    public void print() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Course: " + course);
    }
}