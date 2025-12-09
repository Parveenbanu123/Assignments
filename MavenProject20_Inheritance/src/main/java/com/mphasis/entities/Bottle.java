package com.mphasis.entities;

import jakarta.persistence.Entity;

@Entity
public class Bottle extends Product{

	private String brand;
	private double bcost;
	private double capacity;
	public Bottle() {
		super();
	}
	public Bottle(String brand, double bcost, double capacity) {
		super();
		this.brand = brand;
		this.bcost = bcost;
		this.capacity = capacity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return bcost;
	}
	public void setCost(double bcost) {
		this.bcost = bcost;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Bottle [brand=" + brand + ", cost=" + bcost + ", capacity=" + capacity + "]";
	}
	
	
}
