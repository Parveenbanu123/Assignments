package com.mphasis.dao;

import java.time.LocalDate;

import java.util.List;

import com.mphasis.model.Order;

public interface OrderDaoInterface {
	public List<Order> findAll();
	public Order findById(int id);
	public void addOrder(Order e);
	public Order updateOrder(Order o,int id);
	public void deleteOrder(int id);
	public List<Order> findByDate(LocalDate ordDate);
	public List<Order> findByFilters(LocalDate ordDate,double ordCost);
}
