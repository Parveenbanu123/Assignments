package com.mphasis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.dao.OrderDao;
import com.mphasis.dao.PaymentDao;
import com.mphasis.entities.Order;
import com.mphasis.entities.Payment;

@Service
public class OrderService {
	
	@Autowired
	OrderDao orderDao;
	@Autowired
	PaymentDao paymentDao;
	
	@Transactional
	public void placeOrder(Order order,Payment payment) {
			Long id=orderDao.save(order);
			payment.setOrderId(id);
			paymentDao.save(payment);
			System.out.println("Order placed,Payment pending");
			
	}
	
}
