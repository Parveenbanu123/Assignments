package com.mphasis.dto;



public class ItemDto {
	
	
	private String itemName;
	private double itemCost;
	public ItemDto() {
		super();
	}
	public ItemDto( String itemName, double itemCost) {
		super();
		
		this.itemName = itemName;
		this.itemCost = itemCost;
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
	@Override
	public String toString() {
		return "ItemDto [ itemName=" + itemName + ", itemCost=" + itemCost + "]";
	}
	
	
}
