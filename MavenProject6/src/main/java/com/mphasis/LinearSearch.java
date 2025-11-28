package com.mphasis;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {12,23,32,21,33,45,54,6,2,7,38,4,49,7,0};
		System.out.println("Enter the element to be search:");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int i=0;
		for(;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println(key+" founded at the position "+(i+1));
				break;
			}
		}
		if(i==arr.length) {
			System.out.println("Element not found");
		}
	}
}
