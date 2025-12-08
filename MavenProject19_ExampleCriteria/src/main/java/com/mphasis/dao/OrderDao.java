package com.mphasis.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mphasis.model.Order;
import com.mphasis.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class OrderDao implements OrderDaoInterface {

	@Override
	public List<Order> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Order> orderList=session.createNamedQuery("Order.findAll",Order.class).list();
		//System.out.println(orderList);
		session.close();
		return orderList;
	}

	@Override
	public Order findById(int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Order o=session.get(Order.class,id);
		session.close();
		return o;
	}

	@Override
	public void addOrder(Order o) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(o);
		t.commit();
		session.close();

	}

	@Override
	public Order updateOrder(Order o, int id) {
		return null;
	}

	@Override
	public void deleteOrder(int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		 Order o=session.get(Order.class, id);
       if(o!=null) {
    	   session.delete(o);
    	   System.out.println("Deleted successfully");
       }
       else {
    	   System.out.println("No Order found");
       }
       t.commit();
       session.close();

	}

	@Override
	public List<Order> findByFilters(LocalDate ordDate, double ordCost) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Order> cq=cb.createQuery(Order.class);
		Root<Order> root=cq.from(Order.class);
		List<Predicate> predicates=new ArrayList<Predicate>();
		if(ordDate!=null) 
			predicates.add(cb.equal(root.get("ordDate"),ordDate ));
		
		if(ordCost!=0) 
			predicates.add(cb.greaterThanOrEqualTo(root.get("ordCost"),ordCost ));
		
		cq.where(predicates.toArray(new Predicate[0]));
		List<Order> l=session.createQuery(cq).getResultList();
		session.close();
		return l;
	}

	@Override
	public List<Order> findByDate(LocalDate ordDate) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Query<Order> q=session.createNamedQuery("Order.findByDate",Order.class);
		q.setParameter("ordDate", ordDate);
		List<Order> list=q.list();
		session.close();
		return list;
		
	}

}
