package com.mphasis;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(338,"Parveen",25000);
		Employee e2=new Employee(347,"Saranya",30000);
		Employee e3=new Employee(349,"Sathis",19000);
		Employee e4=new Employee(304,"Arthika",20000);
		Employee e5=new Employee(340,"Praveenkumar",27000);
		
		Employee arr[]=new Employee[5];
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		arr[3]=e4;
		arr[4]=e5;
		
		
//		SortInterface comparator=(e11,e12)->Double.compare(e11.getSalary(), e12.getSalary());
//		Arrays.sort(arr,(e13,e14)->comparator.salaryComparator(e13, e14));
		
		
		
		Arrays.sort(arr,(emp1,emp2)->emp1.getName().compareTo(emp2.getName())); //FI not used
		
		for(Employee e:arr) {
			System.out.println(e);
		}
		

	}

}
