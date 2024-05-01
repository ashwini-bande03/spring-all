package com.spring.employee.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.employee.EmployeeBean;


public class EmployeeDaoImp implements EmployeeDao {

    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int saveEmployee(EmployeeBean employeeBean) {
        return (Integer) hibernateTemplate.save(employeeBean);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        EmployeeBean employeeToDelete = hibernateTemplate.get(EmployeeBean.class, id);
        if (employeeToDelete != null) {
            hibernateTemplate.delete(employeeToDelete);
        }
    }

    @Override
    @Transactional
    public List<EmployeeBean> employeeAll() {
        return hibernateTemplate.loadAll(EmployeeBean.class);
    }

    @Override
    @Transactional
    public EmployeeBean viewEmployeeOne(int id) {
        return hibernateTemplate.get(EmployeeBean.class, id);
    }

    @Override
    @Transactional
    public void updateEmployee(EmployeeBean employeeBean) {
        hibernateTemplate.update(employeeBean);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public EmployeeDaoImp(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public EmployeeDaoImp() {
    }
}