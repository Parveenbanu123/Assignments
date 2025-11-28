package com.mphasis;

import java.util.Arrays;

public class NamePrintClass {

	public static void main(String[] args) {
		
//		NamePrinter n=(str)->{
//			System.out.println(new StringBuilder(str).reverse());
//		};
//		n.stringReverse("Parveen banu");
		
//		NamePrinter n=(num)->{
//			System.out.println(num%2==0?"even":"odd");
//		};
//		n.isEven(29);
		
//		NamePrinter n=(int a[])->{
//			for(int i:a) {
//				System.out.println(i*i);
//			}
//		};
//		int a[]={1,2,3,4,5,6,7};
//		n.squareNum(a);
		String[] s= {"Parveen","Banu","Ashik","Wahith"};
		
//		NamePrinter n=(String a[])->{
//			Arrays.sort(s);
//			for(String i:s) {
//				System.out.println(i);
//			}
//		};
//		
//		
//		n.sortString(s);
		
		NamePrinter n=(String[] a)->{
			int arr[]=new int[a.length];
			for(int i=0;i<a.length;i++) {
				arr[i]=a[i].length();
			}
			return arr;
		};
		int res[]=n.lengthString(s);
		for(int i=0;i<res.length;i++) {
			System.out.println(s[i]+" "+res[i]);
		}
	}
}
