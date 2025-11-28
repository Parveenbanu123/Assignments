package com.mphasis;

public class BankAccount {
	
	private double balance=15000;
	private  void  withDraw(double amount) {
		System.out.println(Thread.currentThread().getName() + " Running");

		synchronized (this) {
			if (amount > balance)
				System.out.println("Insufficient funds");
			else {

				System.out.println(Thread.currentThread().getName() + " is doing transaction");
				balance -= amount;
				System.out.println("Remaining balance of " + Thread.currentThread().getName() + " is:Rs " + balance);

			}
		}
			
	}
	
	public static void main(String[] args) {
		
		BankAccount account=new BankAccount();
		Runnable r=()->{
			account.withDraw(1000);
		};
		Thread t1=new Thread(r,"user1");
		Thread t2=new Thread(r,"user2");
		t1.start();
		t2.start();
	}
//implement a scenario that uses multi-threading assuming no of checks of threads and manages checks to complete order of restaurant

	

}
