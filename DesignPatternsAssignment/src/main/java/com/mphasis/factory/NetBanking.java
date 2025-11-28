package com.mphasis.factory;

public class NetBanking implements Payment {

	@Override
	public void getPayment() {
		System.out.println("Payment Done using NetBanking");

	}

}
