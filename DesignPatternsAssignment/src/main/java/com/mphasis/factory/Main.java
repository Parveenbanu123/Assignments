package com.mphasis.factory;

public class Main {

	public static void main(String[] args) {
//		Notification sms=NotificationFactory.getNotify("SMS");
//    	sms.getNotification();
//    	
//    	Notification email=NotificationFactory.getNotify("Email");
//    	email.getNotification();
//    	
//    	Notification push=NotificationFactory.getNotify("Push");
//    	push.getNotification();
		
		
//		Transport bus=TransportFactory.getTransportType("Bus");
//    	bus.getTransport();
//    	
//    	Transport train=TransportFactory.getTransportType("Train");
//    	train.getTransport();
//    	
//    	Transport flight=TransportFactory.getTransportType("Flight");
//    	flight.getTransport();
		
		Payment cc=PaymentFactory.getPaymentType("CreditCard");
    	cc.getPayment();
    	
    	Payment upi=PaymentFactory.getPaymentType("UPI");
    	upi.getPayment();

    	Payment net=PaymentFactory.getPaymentType("NetBanking");
    	net.getPayment();


	}

}
