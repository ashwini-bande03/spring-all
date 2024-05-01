package com.spring.jdbc.StudentBeans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;


public class studentBean {
   
    private static JdbcTemplate jdbcTemplate;
	private static JdbcTemplate jdbcTemplatet;
   

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        studentBean.jdbcTemplate = jdbcTemplate;
    }

    public studentBean() {
        
    }

    public studentBean(JdbcTemplate jdbcTemplate) {
        studentBean.jdbcTemplate = jdbcTemplate;
    }

    public void create() {
        jdbcTemplate.execute("CREATE TABLE student (id INT, name VARCHAR(20), course VARCHAR(20))");
        System.out.println("Table created");
    }
    public static void insert() {
    	
        	int insert =jdbcTemplatet.update("insert into studentBean");
        	System.out.println(insert +"student inserted");	
    
    }

	public static void delete() {
		int delete =((JdbcTemplate) jdbcTemplatet).update("insert into from delete");
		System.out.println(delete +"student delete");	
	}
	@SuppressWarnings("unchecked")
	public static void getoneRecord() {
		List<Map<String,Object>> oneRecord=jdbcTemplate.queryForList("select * from student where id ='101' "); 
         @SuppressWarnings("unused")
		Iterator<Map<String, Object>> jdbcTemplate=oneRecord.iterator();
		while(((Iterator<Map<String, Object>>) jdbcTemplatet).hasNext());
		Object obj=((Iterator<Map<String, Object>>) jdbcTemplatet).next();
		System.out.println(obj.toString());
		
		
	}
	
}