package com.mphasis;

import java.util.function.Function;

public class DemoOnFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> squareFunction=(num)->num*num;
		int arr[]= {1,8,4,7,3,6,5,1,0,90};
		for(int i=0;i<arr.length;i++)
			System.out.println(squareFunction.apply(arr[i]));
		
		
		Employee e1=new Employee(338,"Parveen",25000);
		Employee e2=new Employee(347,"Saranya",30000);
		Employee e3=new Employee(349,"Sathis",19000);
		Employee e4=new Employee(304,"Arthika",20000);
		Employee e5=new Employee(340,"Praveenkumar",27000);
		
		Employee emparr[]= {e1,e2,e3,e4,e5};
		Function<Employee, String> upperCaseFunction=(e)->e.getName().toUpperCase();
		for(Employee emp:emparr)
			System.out.println(upperCaseFunction.apply(emp));
		
		Function<Integer,Integer> add20=(num)->num+20;
		System.out.println(squareFunction.andThen(add20).apply(5));
		
		Function<Employee, Double> checkSalary=(e)->{
			if(e.getSalary()>20000)
				return e.getSalary();
			return null;
		};
		
		Function<Employee, Double> addBonus=(e)->{
			return e.getSalary();
		};
		for(Employee emp:emparr)
			System.out.println(checkSalary.apply(emp)+" "+(addBonus).apply(emp));
			
	}

}
