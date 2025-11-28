package com.mphasis;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ans=0;
		int r;
		while(num>0) {
			r=num%10;
			ans=ans*10+r;
			num/=10;
		}
		System.out.println(ans);
	}
}
