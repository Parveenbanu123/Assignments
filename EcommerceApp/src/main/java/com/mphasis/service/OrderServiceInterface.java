package com.mphasis.service;

import java.util.List;

import com.mphasis.entities.Order;

public interface OrderServiceInterface {
	public List<Order> findAll();
	public Order save(Order order,List<Long> itemIds);
	public Order findById(Long id) ;
}
