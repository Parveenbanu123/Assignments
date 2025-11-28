package com.mphasis;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
	public static void main(String[] args) {
		int arr[]= {12,23,32,21,33,45,54,6,2,7,38,4,49,7,0};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the element to be search:");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int low=0,high=arr.length-1;
		int mid=0;
		//System.out.println(mid);
		while(low<=high) {
			mid=low+(high-low)/2;
			if(arr[mid]==key) {
				System.out.println(key+" found at the position "+(mid+1));
				break;
			}
			else if(arr[mid]<key){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if(low>high) {
			System.out.println("Element not found");
		}
	}
}
