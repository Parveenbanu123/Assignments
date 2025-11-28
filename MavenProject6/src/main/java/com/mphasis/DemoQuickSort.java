package com.mphasis;

import java.util.Arrays;

public class DemoQuickSort {

	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pivot=partition(arr,low,high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
		
	}
	
	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
            
        }
		int t=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=t;
		return (i + 1);
		
		
	}

	public static void main(String[] args) {
		int arr[]= {12,23,32,21,33,45,54,6,2,7,38,4,49,7,0};
		int n=arr.length;
		quickSort(arr,0,n-1);
		
		System.out.println(Arrays.toString(arr));

	}

}
