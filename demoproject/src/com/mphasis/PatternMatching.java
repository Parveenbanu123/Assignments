package com.mphasis;

import java.util.Scanner;

public class PatternMatching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mobileNumber=sc.next();
		if(mobileNumber.matches("[6-9]\\d{9}"))
			System.out.println("Valid Mobile Numer");
		else
			System.out.println("not a valid mobile number");
	}

}
