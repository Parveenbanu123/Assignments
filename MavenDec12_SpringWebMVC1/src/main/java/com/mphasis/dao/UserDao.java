package com.mphasis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.model.User;


@Repository
public class UserDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public void save(User user) {
		hibernateTemplate.save(user);
	}
	
	public User findById(Long uid) {
		return hibernateTemplate.get(User.class,uid);
	}
	
	public List<User> findAll(){
		return hibernateTemplate.loadAll(User.class);
	}
}
