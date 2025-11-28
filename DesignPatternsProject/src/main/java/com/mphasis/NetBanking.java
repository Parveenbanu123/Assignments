package com.mphasis;

public class NetBanking implements Payment {

	private CashPayment cash=new CashPayment();
	@Override
	public void pay(double amount) {
		System.out.println("Netbanking");
		System.out.println("User validated and authenticated");
		System.out.println("OTP verification done");
		System.out.println("Payement successful");
		cash.pay(amount);

	}

}
