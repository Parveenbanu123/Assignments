package com.mphasis.factory;

public class SMS implements Notification {

	@Override
	public void getNotification() {
		System.out.println("Notification Type:SMS");

	}

}
