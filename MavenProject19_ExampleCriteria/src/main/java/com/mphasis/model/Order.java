package com.mphasis.model;

import java.time.LocalDate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_table")
@NamedQueries({@NamedQuery(name="Order.findAll",query="From Order"),
	@NamedQuery(name="Order.findByDate",query="From Order where ordDate=:ordDate")})
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ordId;
	private LocalDate ordDate;
	private double ordCost;
	private List<String> items;
	public Order() {
		super();
	}
	public Order(int ordId, LocalDate ordDate, double ordCost, List<String> items) {
		super();
		this.ordId = ordId;
		this.ordDate = ordDate;
		this.ordCost = ordCost;
		this.items = items;
	}
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public LocalDate getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(LocalDate ordDate) {
		this.ordDate = ordDate;
	}
	public double getOrdCost() {
		return ordCost;
	}
	public void setOrdCost(double ordCost) {
		this.ordCost = ordCost;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordDate=" + ordDate + ", ordCost=" + ordCost + ", items=" + items + "]";
	}
	
	
	
}
