package com.spring.second._second.stundent;

public class Student {
    private int id;
    private String name;
    private String course;
    private int batch;
    private String location;
    
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void printStudent() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(batch);
		System.out.println(location);	
		
	}
    }