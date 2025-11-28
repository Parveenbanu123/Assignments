package com.mphasis;

public class UPIPayment implements Payment {
	
	private CashPayment cash=new CashPayment(); 
	
	@Override
	public void pay(double amount) {
		System.out.println("UPI Payment Processed");
		System.out.println("User validated");
		System.out.println("OTP verification done");
		System.out.println("Payement successful");
		cash.pay(amount);

	}

}
