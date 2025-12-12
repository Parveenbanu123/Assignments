package com.mphasis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.entities.Order;

@Repository
public class OrderDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public Long save(Order order) {
		return (Long) hibernateTemplate.save(order);
	}
	
	public Order findById(Long orderId) {
		return hibernateTemplate.get(Order.class,orderId);
	}
	
	
}
