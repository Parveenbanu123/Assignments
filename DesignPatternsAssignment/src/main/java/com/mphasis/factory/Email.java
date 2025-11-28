package com.mphasis.factory;

public class Email implements Notification {

	@Override
	public void getNotification() {
		System.out.println("Notification Type:Email");
	}

}
