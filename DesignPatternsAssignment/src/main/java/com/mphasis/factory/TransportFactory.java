package com.mphasis.factory;

public class TransportFactory {
	public static Transport getTransportType(String type) {
		if(type.equals("Bus"))
			return new Bus();
		if(type.equals("Train"))
			return new Train();
		if(type.equals("Flight"))
			return new Flight();
		return null;
	}
}
