package com.mphasis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderss")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	private String productName;
	private int nou;
	private double amount;
	
	public Order() {
		super();
	}

	public Order(String productName, int nou, double amount) {
		super();
		this.productName = productName;
		this.nou = nou;
		this.amount = amount;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getNou() {
		return nou;
	}

	public void setNou(int nou) {
		this.nou = nou;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + ", nou=" + nou + ", amount=" + amount
				+ "]";
	}
	
	
	
	
}
