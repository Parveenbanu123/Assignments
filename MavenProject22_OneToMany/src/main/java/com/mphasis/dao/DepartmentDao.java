package com.mphasis.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mphasis.entities.Department;
import com.mphasis.entities.Employee;
import com.mphasis.util.HibernateUtil;

public class DepartmentDao implements DepartmentDaoInterface{
	public List<Department> findAll(){
		Session session=HibernateUtil.buildSessionFactory().openSession();
		return session.createQuery("From Department",Department.class).list();
		
		
	}
	
	public void addDepartment(Department d) {

		
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction txn=session.beginTransaction();
		session.save(d);
		txn.commit();
		session.close();
		System.out.println("Added successfully");
	}
	
	
	public Department findById(int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Department d= session.get(Department.class, id);
		session.close();
		return d;
		
	}
	
	public void delete(int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction txn=session.beginTransaction();
		Department d= session.get(Department.class, id);
		if(d!=null) {
			session.delete(d);
			txn.commit();
			System.out.println("Deleted successfully");
		}
		
		session.close();
		
		
	}

}
