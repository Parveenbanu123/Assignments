package com.mphasis;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnStaticMethodeference {
		
	//classname::methodname  Static Method Reference
	//objname::methodname    Object Method Reference
	
	static class NumberUtil{
		public static int squareNum(int num) {
			return num*num;
		}
		
		public static double findLog(double num) {
			return Math.log(num);
		}
		
		public static boolean isEven(int num) {
			return num%2==0;
		}
	}
	
	
	static class StringUtil{
		public static int findLength(String s) {
			return s.length();
		}
	}
	
	public static void main(String[] args) {
		Function<Integer, Integer> squareFunctionusingLambda=(num)->NumberUtil.squareNum(num);
		Function<Integer, Integer> squareFunctionMR=NumberUtil::squareNum;
		System.out.println(squareFunctionusingLambda.apply(8));
		System.out.println(squareFunctionMR.apply(7));
		
		
		Function<Double, Double> logFunctionMR=NumberUtil::findLog;
		Function<Double, Double> logFunctionLambda=(num)->NumberUtil.findLog(num);
		System.out.println(logFunctionMR.apply(10.50));
		System.out.println(logFunctionLambda.apply(38.49));
		
		
		Predicate<Integer> isEvenUsingLambda=(num)->NumberUtil.isEven(num);
		Predicate<Integer> isEvenUsingMR=NumberUtil::isEven;
		System.out.println(isEvenUsingLambda.test(15)?"Even":"Odd");
		System.out.println(isEvenUsingMR.test(38)?"Even":"Odd");
		
		String str="Parveen";
		Function<String, Integer> findLengthUsingMR=StringUtil::findLength;
		Function<String, Integer> findLengthUsingLambda=(s)->StringUtil.findLength(s);	
		System.out.println(findLengthUsingLambda.apply(str));
		System.out.println(findLengthUsingMR.apply(str));
	}
	
	
	
	
}
