package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.StudentDao;



public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext contex= new ClassPathXmlApplicationContext("springconfig.xml");
    	StudentDao dao=(StudentDao)contex.getBean("stDao");
    	dao.toString();
    	
    	StudentBean std=new StudentBean();
    	
 	    std.setId(101);
    	std.setName("Ashu");
    	std.setCourse("javafullstack");
    	dao.saveStudent(std);
//      
//   StudentBean i=dao.viewStudentOne(10);
//      System.out.println(i);
      
//      int i= deleteStudent(10);
//      System.out.println(i);
//      
    	
    	/*List<StudentBean>st=dao.StudentAll();
    	System.out.println(st);*/
//    	
//    	StudentBean studentOne=dao.viewStudentOne(StudentBean.class,102);
//    	studentOne.setId(102);
//    	studentOne.setName("Ashu");
//    	studentOne.setCourse("javafullstack");
//    	dao.updatestudent(studentOne);
//    	System.out.println("update successful");
    }	
}
