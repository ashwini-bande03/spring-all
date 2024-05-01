package com.spring.five._five;

import java.util.List;

public class AmeerpetTechnologiesBean {
	private List <String>studentNames;

	public List<String> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	
	public AmeerpetTechnologiesBean(List<String> studentNames) {
		
		this.studentNames = studentNames;
	}

	public AmeerpetTechnologiesBean() {
		
	}

	
	public void print() {
		for(String student:studentNames) {
			System.out.println(student);
		}
	}
	
}
