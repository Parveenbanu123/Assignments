package com.mphasis.dao;

import java.util.List;
import java.util.Optional;

import com.mphasis.entities.Order;

public interface OrderDaoInterface {
	
	public List<Order> findAll();
	public Order save(Order order);
	public Optional<Order> findById(Long id);
	
	
}
