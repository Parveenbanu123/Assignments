package com.mphasis;

public class DemoBubbleSort {
	public static void main(String[] args) {
		int arr[]= {12,23,32,21,33,45,54,6,2,7,38,4,49,7,0};
		int n=arr.length;
		int t;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {//(n-i-1) skipping 1 element after one iteration completed because after one iteration lower value gets its place
				if(arr[j]>arr[j+1]) {
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
