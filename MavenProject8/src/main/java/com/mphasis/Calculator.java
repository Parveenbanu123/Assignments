package com.mphasis;



public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	public int mod(int a,int b) {
		return a%b;
	}
	
	public boolean isEven(int n) {
		
		return n%2==0;
	}
	
	public int[] checkArrays() {
		int arr[]= {1,2,3,4,5};
		
		return arr;
	}
	
	public ArithmeticException checkAE() {
		return new ArithmeticException();
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(10, 3));
		System.out.println(c.sub(10, 3));
		System.out.println(c.mul(10, 3));
		System.out.println(c.div(10, 3));
		System.out.println(c.mod(10,3));
		System.out.println(c.isEven(4));
		System.out.println(c.checkArrays());
		System.out.println(c.checkAE());
	}

	
	
}
