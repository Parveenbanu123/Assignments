package com.mphasis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.dao.ItemDao;
import com.mphasis.dao.OrderDao;
import com.mphasis.entities.Order;
import com.mphasis.exceptions.OrderNotFoundException;

@Service
public class OrderService implements OrderServiceInterface{
	
	@Autowired
	OrderDao dao;
	
	@Autowired
	ItemDao idao;

	@Override
	public List<Order> findAll() {
		return dao.findAll();
	}

	@Override
	public Order save(Order order,List<Long> itemIds) {
		order.setItemList(idao.findItemsById(itemIds));
		return dao.save(order);
	}

	@Override
	public Order findById(Long id)   {
		return dao.findById(id).orElseThrow(()->new OrderNotFoundException("No Order is present with this id:"+id));
	}

}
