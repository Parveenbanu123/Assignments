package com.mphasis.entities;




import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;


@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemId;
	@Size(min=3,message="Item name must be minimum of 3 characters")
	private String itemName;
	@DecimalMin(value="1000" ,message="Item cost must be above 1000")
	private double itemCost;
	@ManyToMany(mappedBy = "itemList")
	@JsonBackReference
	private List<Order> orderList;
	
	
	
	public Item() {
		super();
	}

	

	public Item(@Size(min = 3, message = "Item name must be minimum of 3 characters") String itemName,
			@DecimalMin(value = "1000", message = "Item cost must be above 1000") double itemCost,
			List<Order> orderList) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.orderList = orderList;
	}



	public Item(Long itemId, String itemName, double itemCost) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}



	public List<Order> getOrderList() {
		return orderList;
	}



	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}



	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + ", orderList="
				+ orderList + "]";
	}
	
	
	
	
	
}
