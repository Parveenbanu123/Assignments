package com.mphasis;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {


		System.out.println(Thread.currentThread().getName() + " is Running...");
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " value: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


	}
	public static void main(String[] args) {
		Thread t=new Thread(new RunnableDemo());
		t.start();
	}

}
