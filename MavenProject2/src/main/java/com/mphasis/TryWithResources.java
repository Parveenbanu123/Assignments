package com.mphasis;

public class TryWithResources implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Resource closed successfully");
	}
	
	public static void main(String[] args) throws Exception{
		
		TryWithResources t=new TryWithResources();
		DemoOnException d=new DemoOnException();
		try(d;t){
			System.out.println("Using Demo Resource");
		}
	}
}
