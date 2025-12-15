package com.mphasis.dto;

import java.time.LocalDate;
import java.util.List;

public class OrderDto {
	
	private LocalDate ordDate;
	private String custName;
	private List<Long> itemIds;
	public OrderDto() {
		super();
	}
	public OrderDto(LocalDate ordDate, String custName, List<Long> itemIds) {
		super();
		this.ordDate = ordDate;
		this.custName = custName;
		this.itemIds = itemIds;
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
	public List<Long> getItemIds() {
		return itemIds;
	}
	public void setItemIds(List<Long> itemIds) {
		this.itemIds = itemIds;
	}
	@Override
	public String toString() {
		return "OrderDto [ordDate=" + ordDate + ", custName=" + custName + ", itemIds=" + itemIds + "]";
	}
	
	
}
