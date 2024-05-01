package com.injection.Student;
public class School {
	private String Scname;
	private Student stu;
	School(Student stu){
		this.stu=stu;
	}
	void print() {
		System.out.println(Scname);
		System.out.println(stu);
		System.out.println(stu.getStname()+""+stu.getSclass()+""+stu.getMark());
	}
    public void setScname(String name) {
    	this.Scname=name;
    }
    public void String getScname() {
    	retun Scname;
    }
    public void setStu(Student stu) {
    	this.stu=stu;
    }
    public Student getStu() {
    	return stu;
    }
}
