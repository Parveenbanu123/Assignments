package com.mphasis;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println("Not Prime Number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("prime");
		}
	}

}
