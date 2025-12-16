package com.mphasis.service;

import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.entities.User;
import com.mphasis.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface{
	//private static final Logger logger=LoggerFactory.getLogger(UserService.class);
	@Autowired
	UserRepository repository;
	
	public List<User> findAll(){
		//logger.info("Fetching all Employees");
		return repository.findAll();
	}
	
	public User findById(Long eid) {
		//logger.info("Retrieving Employee by Id");
		return repository.findById(eid).get();
	}
	
	public User save(User user) {
		//logger.info("Saving an Employee");
		return repository.save(user);
	}

	
}
