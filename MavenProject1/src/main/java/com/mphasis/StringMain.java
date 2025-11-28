package com.mphasis;

public class StringMain {

	public static void main(String[] args) {
		String s="Hello";
		String s1="  Hello World  ";
		String s3=new String("Hello");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s.length());
		System.out.println(s1.indexOf('W'));
		String s4="Mphasis";
		System.out.println(s3.concat(s4));
		System.out.println(s3);
		System.out.println(s==s3);//reference comparison
		System.out.println(s.equals(s3));//value comparison
		System.out.println(s1.substring(6,11));//starting inclusive,ending exclusive
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		

	}

}
