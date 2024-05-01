package com.spring.studentBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class studentBean {
	
	@Value("1")
	private int sId;
	@Value("ashu")
	private String sName;
	@Value("java fullstack")
	private String course;
	
	@Value("10th")                                       
	private String sBatch;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getsBatch() {
		return sBatch;
	}
	public void setsBatch(String sBatch) {
		this.sBatch = sBatch;
	}
	public studentBean(int sId, String sName, String course, String sBatch) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.course = course;
		this.sBatch = sBatch;
	}
	public studentBean(){
	}
	
	public void display() {
		System.out.println("student : +id:"+sId);
		System.out.println("student :+name:"+"Ashu");
		System.out.println("student :course:"+"javafulstack");
		System.out.println("student :batch:"+"10th");	
	}

}
