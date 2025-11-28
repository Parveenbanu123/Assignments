package com.mphasis;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) throws InsufficientFundsExcepition{
		Scanner sc=new Scanner(System.in);
		SavingAccount acc=new SavingAccount(123456,"Parveen banu","HDFC","HDFC0001859","Porur",500);
		System.out.println(acc);
//		do {
//			System.out.println("1.Saving Account");
//			System.out.println("2.Current Account");
//			int accChoice=sc.nextInt();
//			switch(accChoice) {
//			if(accChoice==1) {
//				System.out.println("Enter the details of Savings Account:");
//				
//			}
//			}
//		}
		acc.deposit(10000);
		try {
		
		acc.withDraw(15000);
		
		}catch(InsufficientFundsExcepition e) {
			e.printStackTrace();
		}
		System.out.println(acc.checkBalance());
	}

}
