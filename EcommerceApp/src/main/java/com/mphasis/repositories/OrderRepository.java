package com.mphasis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphasis.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
