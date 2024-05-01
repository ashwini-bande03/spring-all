package com.spring.six._six;

import java.util.Set;

public class Ameerpet {
	private Set<Integer> studentRollNumbers;
	
	public Ameerpet(Set<Integer> studentRollNumbers) {
		this.studentRollNumbers=studentRollNumbers;
	}
	
	public void setStudentRollNumbers(Set<Integer> studentRollNumbers) {
		this.studentRollNumbers=studentRollNumbers;
	}
	public Set<Integer> getStudentRollNumbers(){
		return studentRollNumbers;
	}
	public Ameerpet() {
		
	}
	public void printStudentRollNumbers() {
		for(Integer student:studentRollNumbers) {
			System.out.println(student);
		}
	}
}




	
