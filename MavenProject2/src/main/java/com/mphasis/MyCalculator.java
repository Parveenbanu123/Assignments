package com.mphasis;

public class MyCalculator{

	public static void main(String[] args) {
		
		//Calculator c1=(a, b)-> a+b;
		//System.out.println(c1.add(5,6);
		
//		Calculator c2=(a,b)->System.out.println(a-b);
//		c2.sub(10, 5);
		
//		Calculator c3=()->{
//			int a=8,b=5;
//			System.out.println(a*b);
//		};
//		c3.mul();

		Calculator c4=()->{
			int a=9,b=2;
			return (float)a/b;
		};
		System.out.println(c4.div());
		
		
	}

}
