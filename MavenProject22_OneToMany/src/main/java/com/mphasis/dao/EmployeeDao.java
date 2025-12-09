package com.mphasis.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mphasis.entities.Employee;
import com.mphasis.util.HibernateUtil;

public class EmployeeDao implements EmployeeDaoInterface{
	public List<Employee> findAll(){
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Employee> elist=session.createQuery("From Employee",Employee.class).list();
		session.close();
		return elist;
	}
	
	public void addEmployee(Employee e) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction txn=session.beginTransaction();
		session.save(e);
		txn.commit();
		session.close();
		System.out.println("Added successfully");
	}
	
	public Employee findById(int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
			Employee e= session.get(Employee.class, id);
			session.close();
			return e;
		
	}
}
