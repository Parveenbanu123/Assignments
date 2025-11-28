package com.mphasis;

public class DBConnection {
	private static DBConnection instance;
	private DBConnection() {
		System.out.println("Instance created");
	}
	
	public static DBConnection getInstance() {
		if(instance==null) {
			instance=new DBConnection();
		}
			
		return instance;
	}
}
