package com.mphasis;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Parveen ");
		sb.append("Banu,");
		sb.append("Saranya,");
		sb.append("Sathis");
		sb.append("Parveen ");
		sb.append("Banu,");
		sb.append("Saranya,");
		sb.append("Sathis");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(80);
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("Name");
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(15);
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(30);
		System.out.println(sb1.capacity());//20*2+2=42

		
		StringBuilder sbb=new StringBuilder("Parveen banu");
		//sbb.replace(1, 3, "**#*");
		System.out.println(sbb); 
		
		String str="Apple,Banana,Cherry,Pineapple";
		StringTokenizer tokenizer=new StringTokenizer(str,",");
		while(tokenizer.hasMoreTokens()) // Splitting the string using tokenizer
			System.out.println(tokenizer.nextToken());
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("Parveen");
		sj.add("Banu");
		sj.add("saranya");
		System.out.println(sj);
	}

}
