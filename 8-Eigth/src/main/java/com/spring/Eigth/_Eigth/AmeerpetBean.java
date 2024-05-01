package com.spring.Eigth._Eigth;

import java.util.Properties;
import java.util.Set;

public class AmeerpetBean {
	
		private Properties studentBatches;
		
		
		public AmeerpetBean(Properties studentBatches) {
			this.studentBatches=studentBatches;
		}
		public void setStudentBatches1(Properties studentBatches) {
			this.studentBatches=studentBatches;
		}
		public Properties  getStudentBatches() {
			return studentBatches;
		}
		public AmeerpetBean() {
			
		}
		public void print() {
			Set<String>keys=studentBatches.stringPropertyNames();
					for(String key:keys) {
						System.out.println(key +":" +studentBatches.getProperty(key));
					}
		}
		
			
	}
