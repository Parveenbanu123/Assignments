package com.mphasis.factory;



public class NotificationFactory {
	public static Notification getNotify(String type) {
		if(type.equals("SMS"))
			return new SMS();
		if(type.equals("Email"))
			return new Email();
		if(type.equals("Push"))
			return new Push();
		return null;
	}
}
