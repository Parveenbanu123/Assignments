package com.mphasis.factory;

public class PaymentFactory {
	public static Payment getPaymentType(String type) {
		if(type.equals("CreditCard"))
			return new CreditCardPayment();
		if(type.equals("UPI"))
			return new UPIPayment();
		if(type.equals("NetBanking"))
			return new NetBanking();
		return null;
	}
}
