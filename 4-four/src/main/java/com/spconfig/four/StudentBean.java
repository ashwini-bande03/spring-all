package com.spconfig.four;

public class StudentBean {
	
	private int studentId;
	private String studentName;
	private AddressBean addressBean;
	
	public int getStudentId() {
	return studentId;
	}
	public void setStudentId(int studentId) {
	this.studentId = studentId;
	}
	public String getStudentName() {
	return studentName;
	}
	public void setStudentName(String studentName) {
	this.studentName = studentName;
	}
	public AddressBean getAddressBean() {
	return addressBean;
	}
	public void setAddressBean(AddressBean addressBean) {
	this.addressBean = addressBean;
	}
	public StudentBean(int studentId, String studentName, AddressBean
	addressBean) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.addressBean = addressBean;
	}
	public StudentBean() {
	super();
	}

	public void print() {
		System.out.println( "StudentBean [studentId=" + studentId + ", studentName=" + studentName + ", addressBean=" + addressBean
				+ ", getStudentId()=" + getStudentId() + ", getStudentName()=" + getStudentName()
				+ ", getAddressBean()=" + getAddressBean());
				
	}
	}
