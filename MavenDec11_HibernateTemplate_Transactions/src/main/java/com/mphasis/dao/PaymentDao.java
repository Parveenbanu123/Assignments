package com.mphasis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.entities.Payment;

@Repository
public class PaymentDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public Long save(Payment p) {
		return (Long) hibernateTemplate.save(p);
	}
	
	public Payment findById(Long id) {
		return hibernateTemplate.get(Payment.class,id);
	}
	
}
