package com.mphasis;

import java.util.Arrays;

public class DemoSelectionSort {

	public static void main(String[] args) {
		int arr[]= {12,23,32,21,33,45,54,6,2,7,38,4,49,7,0};
		int n=arr.length;
		int t;
		for(int i=0;i<n-1;i++) {
			int min=i;//assume minimum index is i'th index
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;//finding minimum index 
				}
			}
			t=arr[i];//swapping minimum index value with i'th element 
			arr[i]=arr[min];
			arr[min]=t;
		}
		System.out.println(Arrays.toString(arr));

	}

}
