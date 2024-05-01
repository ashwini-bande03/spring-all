package com.spring.jdbcEmployee;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeBean {
	private int empId;
	private String empname;
	private double empsalary;
	private int depositNo;
	private JdbcTemplate jt;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public int getDepositNo() {
		return depositNo;
	}
	public void setDepositNo(int depositNo) {
		this.depositNo = depositNo;
	}
	public JdbcTemplate getJt() {
		return jt;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public EmployeeBean(int empId, String empname, double empsalary, int depositNo, JdbcTemplate jt) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empsalary = empsalary;
		this.depositNo = depositNo;
		this.jt = jt;
	}
	public EmployeeBean() {
		
		
	}
	public void create() {
		jt.execute("create table employee (id number,name varchar(20),salary double(depositNo)");
		System.out.println("table create");
	}
	public void insert() {
		jt.update("insert into employee values(101,'Ashu',70000)");
		jt.update("insert into employee values(102,'manu',4000)");
		jt.update("insert into employee values(103,'amr',5999)");
		System.out.println("inserted");
		
	}
	public void delete() {
		jt.update("delete from employee ehere id='101'");
		System.out.println("deleted");
		
	}
	
	@SuppressWarnings("null")
	public void getAll() {
		JdbcTemplate jdbcTemplate = null;
		List<Map<String,Object>> oneRecord=jdbcTemplate.queryForList("select * from student where id ='101' "); 
        @SuppressWarnings("unused")
		Iterator<Map<String, Object>> jdbcTemplate1=oneRecord.iterator();
		Iterator<Map<String, Object>> jdbcTemplatet = null;
		while(((Iterator<Map<String, Object>>) jdbcTemplatet).hasNext());
		Object obj=((Iterator<Map<String, Object>>) jdbcTemplatet).next();
		System.out.println(obj.toString());
	}

}
