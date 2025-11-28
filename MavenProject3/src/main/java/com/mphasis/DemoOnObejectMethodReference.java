package com.mphasis;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class NumberUtilMR{
	public int squareNumber(int n) {
		return n*n;
	}
	public boolean isEven(int n) {
		return n%2==0;
	}
	public int cubeNumber(int n) {
		return n*n*n;
	}
	public double logNum(double n) {
		return Math.log(n);
	}
	public void printNum(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

public class DemoOnObejectMethodReference {

	public static void main(String[] args) {
		String myname="Parveen banu";
		Supplier<Integer> lengthUsingLambda=()->myname.length();
		Supplier<Integer> lengthUsingMR=myname::length;
		System.out.println(lengthUsingLambda.get());
		System.out.println(lengthUsingMR.get());
		
		
		Hello h=new Hello();
		Supplier<String> helloUsingLambda=()->h.sayHello();
		Supplier<String> helloUsingMR=h::sayHello;
		System.out.println(helloUsingLambda.get());
		System.out.println(helloUsingMR.get());
		
		String str="Ashik";
		Predicate<String> filterStringMR=h::filterString;
		System.out.println(filterStringMR.test(str)?"Starts with A":"Not Starts with A");
		
		String pwd="parve123";
		Predicate<String> filterPassword=h::validatePassword;
		System.out.println(filterPassword.test(pwd)?"Correct Password":"Wrong Password");
		
		
		NumberUtilMR num1=new NumberUtilMR();
		Predicate<Integer> isEvenMR=num1::isEven;
		System.out.println(isEvenMR.test(49)?"Even":"Odd");
		
		Function<Integer,Integer> squareNumMR=num1::squareNumber;
		System.out.println(squareNumMR.apply(7));
		
		Function<Double,Double> logUsingMR=num1::logNum;
		System.out.println(logUsingMR.apply(10.68));
		
		Function<Integer,Integer> cubeNumMR=num1::cubeNumber;
		System.out.println(cubeNumMR.apply(3));
		
		int[] arr= {1,5,8,3,4,67,32,12,11};
		Consumer<int[]> printArrMR=num1::printNum;
		printArrMR.accept(arr);
		
		
		
	}

}
class Hello{
	public String sayHello() {
		return "Hello!!!";
	}
	public boolean filterString(String s) {
		return s.startsWith("A");
	}
	public boolean validatePassword(String pwd) {

		String passwordPattern = "^(?=.*[0-9])"        // at least one digit
                       + "(?=.*[a-z])"         // at least one lowercase letter
                       + "(?=.*[A-Z])"         // at least one uppercase letter
                       + "(?=.*[@#$%^&+=])"    // at least one special character
                       + "(?=\\S+$)"           // no whitespace
                       + ".{8,}$";             // at least 8 characters

		return pwd.matches(passwordPattern);
	}
}


