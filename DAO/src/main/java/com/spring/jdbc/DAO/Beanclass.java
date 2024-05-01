package com.spring.jdbc.DAO;

import java.sql.JDBCType;


public class Beanclass {
    private static final JDBCType JDBCType = null;
	@SuppressWarnings("unused")
	private java.sql.JDBCType jdbcTemplate;

    public JDBCType getJdbcTemplate() {
    	
    	
    	
    	
        return JDBCType;
    }

    public void setJdbcTemplate(java.sql.JDBCType jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public Beanclass() {
    	
    }

    public Beanclass(JDBCType jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
      
    public void create() {
        JDBCType.execute("create table student(id number, name varchar2(20), course varchar2(20))");
        System.out.println("Table created");
    }
}