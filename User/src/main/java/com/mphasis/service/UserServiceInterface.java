package com.mphasis.service;

import java.util.List;

import com.mphasis.entities.User;

public interface UserServiceInterface {
	public List<User> findAll();
		
	public User findById(Long eid) ;
	public User save(User user) ;
}
