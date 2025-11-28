package com.mphasis;

import java.util.Arrays;

public class DemoInsertionSort {

	public static void main(String[] args) {
		int arr[]= {12,23,32,21,33,45,54,6,2,7,38,4,49,7,0};
		int n=arr.length;
		int k,j;
		for(int i=1;i<n;i++) {
			 k=arr[i];
			 j=i-1;
			while(j>=0&& arr[j]>k) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=k;
		}
		System.out.println(Arrays.toString(arr));
	}

}
