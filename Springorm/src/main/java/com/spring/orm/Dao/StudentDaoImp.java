package com.spring.orm.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.StudentBean;


public abstract class StudentDaoImp implements StudentDao {
    private HibernateTemplate hibernateTemplate;

    public StudentDaoImp(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

   
    public int saveStudent(StudentBean studentBean) {
        Integer savedetails = (Integer) hibernateTemplate.save(studentBean);
        return savedetails;
    }
    @Transactional  
    public void deleteStudent(int id) {
        StudentBean studentToDelete = hibernateTemplate.get(StudentBean.class, id);
        if (studentToDelete != null) {
            hibernateTemplate.delete(studentToDelete);
        }
    }
    @Transactional
     public List<StudentBean>studentAll(){
    	 List<StudentBean>st=hibernateTemplate.loadAll(StudentBean.class);
    	 return st;
    	 
    			 
     }
    @Transactional
     public void updatestudent(StudentBean studentBean) {
    	 hibernateTemplate.update(studentBean);
    	 
     }
    
    
    public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentBean viewStudentOne(int id) {
        return hibernateTemplate.get(StudentBean.class, id);
    }

    public void updateStudent(StudentBean studentBean) {
        hibernateTemplate.update(studentBean);
    }

    public void deleteStudent(StudentBean studentBean) {
        hibernateTemplate.delete(studentBean);
    }

    public List<StudentBean> getAllStudents() {
        return hibernateTemplate.loadAll(StudentBean.class);
    }
}