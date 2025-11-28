package com.mphasis.factory;

public class CreditCardPayment implements Payment {

	@Override
	public void getPayment() {
		System.out.println("Payment done using CreditCard");

	}

}
