package com.employees.Employees;

public class EmployeeCounstructor {
	private static final int Id = 0;
	private static final String Name = null;
	private static final String Course = null;
	int empId;
	String empName;
	String empCourse;
	public EmployeeCounstructor(int Id,String Name,String Course) {
	}
	{
		this.empId=Id;
		this.empName=Name;
		this.empCourse=Course;
	}
	public void print() {
		System.out.println("EmpId:"+empId);
		System.out.println("EmpName:"+empName);
		System.out.println("EmpCourse:"+empCourse);
	}

}
