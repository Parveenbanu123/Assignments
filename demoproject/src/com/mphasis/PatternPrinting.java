package com.mphasis;

import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				 System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i=row-1;i>=1;i--) {
			for(int k=1;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				 System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
