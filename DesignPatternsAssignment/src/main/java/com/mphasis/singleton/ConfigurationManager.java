package com.mphasis.singleton;

public class ConfigurationManager {
	private static ConfigurationManager config;
	private ConfigurationManager() {
		System.out.println("App Settings Loaded");
	}
	public static ConfigurationManager getConfig() {
		if(config==null)
			config=new ConfigurationManager();
		return config;
	}
	
}
