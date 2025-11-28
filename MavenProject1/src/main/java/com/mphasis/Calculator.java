package com.mphasis;

public class Calculator implements ScientificCalculator{
		public void add(int a,int b) {
			System.out.println(a+b);
		}
		public void add(double a,int b) {
			System.out.println(a+b);
		}
		public void add(double a,double b) {
			System.out.println(a+b);
		}
		public void add(float a,int b) {
			System.out.println(a+b);
		}
		public void add(float a,double b) {
			System.out.println(a+b);
		}
		public void add(float a,float b) {
			System.out.println(a+b);
		}
		public void add(String a,String b) {
			System.out.println(a+b);
		}
		public void add(ComplexNumber c1,ComplexNumber c2) {
			ComplexNumber c3=new ComplexNumber();
			c3.real=c1.real+c2.real;
			c3.img=c1.img+c2.img;
			System.out.println(c3.real+"+"+c3.img+"i");
		}
		//matrix addition,fraction addition
		
		public static void main(String[] args) {
			Calculator c=new Calculator();
			c.add("Parveen", " Banu");
			
			ComplexNumber c1=new ComplexNumber(3,4);
			ComplexNumber c2=new ComplexNumber(5,6);
			c.add(c1, c2);
			
		}
		@Override
		public double power(double m, double n) {
			return Math.pow(m, n);
		}
		@Override
		public double squareroot(double m) {
			return Math.sqrt(m);
		}
		@Override
		public double logValue(double m) {
			return Math.log(m);
		}
}
