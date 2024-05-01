package com.spring.orm.Dao;

import java.util.List;

import com.spring.orm.StudentBean;


public interface StudentDao {
	
	public int saveStudent1(StudentBean StudentBean);
	public StudentBean viewStudentOne(Class<StudentBean> class1, int id);
	public void updatestudent(StudentBean StudentBean);
	public void datastudent(StudentBean StudentBean);
	public List<StudentBean>StudentAll();
	int saveStudent(StudentBean StudentBean);

	
}
