package com.mphasis.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.entities.Order;
import com.mphasis.repositories.OrderRepository;

@Repository
public class OrderDao implements OrderDaoInterface {

	@Autowired
	OrderRepository repo;
	
	@Override
	public List<Order> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public Order save(Order order) {
		return repo.save(order);
	}

	@Override
	public Optional<Order> findById(Long id) {
		return repo.findById(id);
	}

}
