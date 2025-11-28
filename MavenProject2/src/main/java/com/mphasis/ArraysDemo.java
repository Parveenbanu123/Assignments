package com.mphasis;

public class ArraysDemo {

	public static void main(String[] args) {
		Fruits fruitsArr[]=new Fruits[5];
		Fruits f1=new Fruits("Apple","Red",35.50);
		Fruits f2=new Fruits("Orange","Orange",30.50);
		Fruits f3=new Fruits("Mango","Yellow",80.90);
		Fruits f4=new Fruits("Banana","Yelow",10.20);
		Fruits f5=new Fruits("Watermelon","Green",90.55);
		
		fruitsArr[0]=f1;
		fruitsArr[1]=f2;
		fruitsArr[2]=f3;
		fruitsArr[3]=f4;
		fruitsArr[4]=f5;
		
		for(Fruits f:fruitsArr) {
			System.out.println("Cost per dozen for "+f.getFruitName()+" is Rs "+Math.round(f.calculateDozenPrice()));
		}
		
		//System.out.println(f1.calculateDozenPrice());

	}

}
