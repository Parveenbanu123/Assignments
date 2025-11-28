package com.mphasis;

import java.util.Arrays;

public class DemoOnArrayUtilityClass {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		int arr1[]= {10,20,30,40,50,12,45,32,98};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr));
		String nums=Arrays.toString(arr1);
		System.out.println(nums);
		Arrays.sort(arr1);
		int arr2[]= {10,20,30,40,50,12,45,32,98};
		for(int i:arr1)
			System.out.println(i);
		System.out.println(Arrays.binarySearch(arr1, 15));
		System.out.println(Arrays.equals(arr2, arr1));
		
		int arr3[]=Arrays.copyOf(arr2, 20);
		Arrays.fill(arr3, 100);
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
