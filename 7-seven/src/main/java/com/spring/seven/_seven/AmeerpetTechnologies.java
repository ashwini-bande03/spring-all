package com.spring.seven._seven;

import java.util.Map;

	public class AmeerpetTechnologies {
		private Map<String,String> studentCourses;

		public Map<String, String> getStudentCourses() {
			return studentCourses;
		}

		public void setStudentCourses(Map<String, String> studentCourses) {
			this.studentCourses = studentCourses;
		}
		
		public AmeerpetTechnologies(Map<String, String> studentCourses) {
			this.studentCourses = studentCourses;
		}
		public AmeerpetTechnologies() {
			
			
		}
		public void print() {
			
				System.out.println(studentCourses);
			
		}

	
	}
