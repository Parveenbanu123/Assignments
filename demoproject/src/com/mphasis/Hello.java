package com.mphasis;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Mphasis");
		int i=0;
		short s=0;
		long l=0;
		float f=0.0f;
		double d=0.0;
		byte b=0;
		boolean bl=false;
		char c=' ';
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(bl);
		System.out.println(c);
		//System.out.println();
		Integer i1=10;
		i=i1.intValue();
		Short s1=20;
		s=s1.shortValue();
		int a1=120;
		int b1=100;
		int c1=90;
		System.out.println(a1>b1?(a1>c1?a1:c1):(b1>c1?b1:c1));
		System.out.println(a1>b1&&a1>c1?a1:(b1>c1?b1:c1));
		
		// swap two numbers
		int x=15;
		int y=55;
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println(x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
		//swap three numbers
		int z=90;
		x=x+y+z;
		y=x-y-z;
		z=x-y-z;
		x=x-y-z;
		System.out.println(x+" "+y+" "+z);
		
	
	
	}

}
