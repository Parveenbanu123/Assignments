package com.mphasis;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefES extends Thread{

	private String order;

	public ChefES(String order) {
		this.order = order;
	}
	@Override
	public void run() {
		System.out.println(getName()+" is preparing "+order);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(getName()+" got interrupted");
		}
		System.out.println(getName()+" served "+order);
	}


	public static void main(String[] args) {
		ExecutorService manager=Executors.newFixedThreadPool(4);

		String[] menu= {"biryani","chicken curry","Fish curry","Fried rice","rice","mutton","curd rice","paneer fry","chicken 65"};
		for(String s:menu) {
			ChefES chefThread =new ChefES(s);
			manager.submit(chefThread);
		}
		manager.shutdown();
	}

}
