package com.mphasis;

public class Container<T>{
	private T items;

	

	public T getItems() {
		return items;
	}

	public void setItems(T items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Container [items=" + items + "]";
	}
	
}
