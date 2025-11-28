package com.mphasis;

import java.util.function.Predicate;

public class DemoOnPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven=(n)->n%2==0;
		if(isEven.test(38))
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		System.out.println(isEven.test(49)?"Even":"Odd");
		
		Predicate<String> checkLength=(str)-> str.length()>10;
		System.out.println(checkLength.test("Parveen banu")?"Length is greater than 10":"Length is lesser than 10");
		
		Employee e1=new Employee(338,"Parveen",25000);
		Employee e2=new Employee(347,"Saranya",30000);
		Employee e3=new Employee(349,"Sathis",19000);
		Employee e4=new Employee(304,"Arthika",20000);
		Employee e5=new Employee(340,"Praveenkumar",27000);
		
		Employee emparr[]= {e1,e2,e3,e4,e5};
		Predicate<Employee> checkSalary=(err)->err.getSalary()>20000;
		for(Employee e:emparr)
			if(checkSalary.test(e)) 
				System.out.println(e);
			
	}

}
