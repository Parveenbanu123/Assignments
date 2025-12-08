package com.mphasis.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mphasis.model.Employee;
import com.mphasis.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;


public class EmployeeDao implements EmployeeDaoInterface {

	@Override
	public List<Employee> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Employee> empList=session.createNamedQuery("Employee.findAll",Employee.class).list();
		session.close();
		return empList;
	}

	@Override
	public Employee findById(int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Employee e=session.get(Employee.class,id);
		session.close();
		return e;
	}

	@Override
	public void addEmployee(Employee e) {
		
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(e);
		t.commit();
	}

	@Override
	public Employee updateEmployee(Employee emp, int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		

	}

	@Override
	public List<Employee> findByDept(String dept) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Query<Employee> q=session.createNamedQuery("Employee.findByDept",Employee.class);
		q.setParameter("dept", dept);
		List<Employee> list=q.list();
		session.close();
		return list;
	}

	@Override
	public List<Employee> findByFilters(String dept, String desg, double salary) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		Root<Employee> root=cq.from(Employee.class);
		List<Predicate> predicates=new ArrayList<Predicate>();
		if(dept!=null&& !dept.isEmpty()) 
			predicates.add(cb.equal(root.get("dept"),dept ));
		if(desg!=null&& !desg.isEmpty()) 
			predicates.add(cb.equal(root.get("desg"),desg ));
		if(salary!=0) 
			predicates.add(cb.greaterThanOrEqualTo(root.get("salary"),salary ));
		
		cq.where(predicates.toArray(new Predicate[0]));
		List<Employee> l=session.createQuery(cq).getResultList();
		session.close();
		return l;
	}

}
