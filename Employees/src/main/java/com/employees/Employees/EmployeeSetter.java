package com.employees.Employees;

public class EmployeeSetter {
	int empId;
	String empName;
	private String Course;
	public void setEmpId(int empId) {
		this.empId=empId;
		
	}
	public int getEmpId() {
	    return empId;
	}
    public void setEmpName(String empName) {
    	this.empName=empName;
    }
    public String getEmpName() {
    	return empName;
    }
    public void setCourse(String Course) {
    	this.Course=Course;
    }
    public String getCourse() {
    	return Course;
    }
}
