package com.mphasis;

import java.util.Arrays;

public class Order<T> {
	private T item;

	public Order() {
		super();
	}

	public Order(T item) {
		super();
		this.item = item;
	}


	public T getItem() {
		return item;
	}


	public void setItem(T item) {
		this.item = item;
	}


	@Override
	public String toString() {
		if(item instanceof Object[])
			return "Orders [items="+Arrays.toString((Object[])item)+"]";
		return "Order [item=" + item + "]";
	}
	
}
