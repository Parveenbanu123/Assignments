package com.mphasis;

public class Main {

	public static void main(String[] args) {
//		CreditCardPayment cc=new CreditCardPayment();
//		cc.pay(4500);
//		
//		
//		UpiPayment upi=new UpiPayment();
//		upi.pay(50);
		
		Payment payment=(amount)->{
				if(Payment.validateAmount(amount)) {
					System.out.println("Paid "+amount+" using creditcard");
				}
				else {
					System.out.println("Payment failed , Invalid Amount");
				}
		};
		payment.pay(6000);
		
		Payment payment1=(amount)->{
			if(Payment.validateAmount(amount)) {
				System.out.println("Paid "+amount+" using UPI");
			}
			else {
				System.out.println("Payment failed , Invalid Amount");
			}
		};
		payment1.pay(10000);
	}

}
