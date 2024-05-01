package com.spring.ormstudentBeans;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;

public class App {
    public static void main(String[] args) {
        System.out.println("-----------------");

        
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        
        StudentDao dao = context.getBean("stDao", StudentDao.class);
                                         
        
        
        Student st = new Student();
        st.setId(1);
        st.setName("Ashu");
        st.setAddress("Hyd");

        
        int i = dao.saveStudent(st);
        System.out.println("Insert successfully " + i);

        
        Student st1 = dao.getStudent(1);
        System.out.println("Retrieved student: " + st1);

       
        st1.setName("srikar a");
        dao.updateStudent(st1);
        System.out.println("Update Successfully");

        
        dao.deleteStudent(1);
        System.out.println("Delete Successfully");

        
        List<Student> list = dao.getAllStudent();
        System.out.println("All students:");
        for (Student sts : list) {
            System.out.println(sts);
        }

       
        Student sts = dao.getStudentBy("Ashu", 1);
        System.out.println("Retrieved student by name and ID: " + sts);
    }
}