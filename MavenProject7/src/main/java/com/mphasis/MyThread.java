package com.mphasis;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(this.getName()+" is Running...");
		for(int i=1;i<=5;i++) {
			System.out.println(this.getName()+" value: "+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		
	}
}
