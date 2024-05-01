package com.springorm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.ormstudentBeans.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int saveStudent(Student student) {
        entityManager.persist(student);
        return student.getId(); 
    }

    @Override
    public Student getStudent(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> getAllStudent() {
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
        return query.getResultList();
    }

    @Override
    public void updateStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void deleteStudent(int id) {
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            entityManager.remove(student);
        }
    }
    @Override
    public Student getStudentBy(String email, int id) {
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s WHERE s.email = :email AND s.id = :id", Student.class);
        query.setParameter("email", email);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}