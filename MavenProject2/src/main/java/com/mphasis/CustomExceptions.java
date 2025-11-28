package com.mphasis;

public class CustomExceptions {

	public static void main(String[] args)  {
		Person p=new Person("Parveen",1,12);
		System.out.println(p);
		try {
			p.checkEligibility();
		} catch (AgeNotSufficientException e) {
			
			e.printStackTrace();
		}
		System.out.println("Application Closed!!!");

	}

}
