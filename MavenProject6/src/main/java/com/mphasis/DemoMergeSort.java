package com.mphasis;

import java.util.Arrays;

public class DemoMergeSort {

	private static void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
			
		}

	}
	private static void merge(int[] arr, int left, int mid, int right) {
		int ll=mid-left+1;
		int rl=right-mid;
		int larr[]=new int[ll];
		int rarr[]=new int[rl];
		
		for(int i=0;i<ll;i++) {
			larr[i]=arr[left+i];
		}
		for(int i=0;i<rl;i++) {
			rarr[i]=arr[mid+1+i];
		}
		int i=0,j=0,k=left;
		while(i<ll&&j<rl) {
			if(larr[i]<=rarr[j])
				arr[k++]=larr[i++];
			else
				arr[k++]=rarr[j++];
		}
		while(i<ll)
			arr[k++]=larr[i++];
		while(j<rl)
			arr[k++]=rarr[j++];
		
	}
	public static void main(String[] args) {
		int arr[]= {12,23,32,21,33,45,54,6,2,7,38,4,49,7,0};
		int n=arr.length;
		mergeSort(arr,0,n-1);
		
		System.out.println(Arrays.toString(arr));
		

	}

	

}
