package com.mphasis;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice='y';
		do {
			System.out.println("Parveen");
			System.out.println("Do you want to repeat y/n:");
			choice=sc.next().charAt(0);
		}while(choice!='n');
		System.out.println("Loop Ended");
	}

}
