package com.mphasis.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ordId;
	@NotNull(message="Order Date can't be null")
	private LocalDate ordDate;
	@NotBlank(message="customer Name is mandatory")
	@Size(min=3,message="name must be minimum of 3 chars")
	private String custName;
	@ManyToMany
	@JoinTable(name="order_item",joinColumns = @JoinColumn(name="ordId"),
	inverseJoinColumns = @JoinColumn(name="itemId"))
	@JsonManagedReference
	private List<Item> itemList;
	public Order() {
		super();
	}
	public Order( LocalDate ordDate, String custName, List<Item> itemList) {
		super();
		
		this.ordDate = ordDate;
		this.custName = custName;
		this.itemList = itemList;
	}
	public Long getOrdId() {
		return ordId;
	}
	public void setOrdId(Long ordId) {
		this.ordId = ordId;
	}
	public LocalDate getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(LocalDate ordDate) {
		this.ordDate = ordDate;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordDate=" + ordDate + ", custName=" + custName + ", itemList=" + itemList
				+ "]";
	}
	
}
