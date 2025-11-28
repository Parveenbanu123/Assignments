package com.mphasis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        
    	Integer arr[]= {23,34,55,67,76,87,49,38,90,32,11,43,69,49,38,49,38,49,38};
    	//Integer arr[]= {1,2,3,8};
    	Arrays.stream(arr).forEach(System.out::println);
    	List<Integer> l=Arrays.stream(arr).collect(Collectors.toList());
    	System.out.println(l);
    	Integer min=Arrays.stream(arr).min((a,b)->(a-b)).get();
    	System.out.println(min);
    	Integer max=Arrays.stream(arr).max(Integer::compare).get();//built-in compare in Integer
    	System.out.println(max);
    	Long count=Arrays.stream(arr).count();
    	System.out.println(count);
    	//Sum of Array using Reduce -->Accumulator,Input data(lambda)
    	
    	int sum=Arrays.stream(arr).reduce(0, (a,b)->a+b);
    	System.out.println("Sum of Elements:"+sum);
    	
//    	long mul=Arrays.stream(arr).reduce(1, (a,b)->a*b);
//    	System.out.println("Multiplication of Elements: "+mul);
    	
    	System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b));
    	//Intermediate Operations
    	//1.filter()
    	Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
    	//2.map()
    	Stream.of(arr).map(num->num+10).forEach(System.out::println);
    	//3.limit()
    	Stream.of(arr).limit(4).forEach(System.out::println);
    	//4.distinct()
    	System.out.println("**************************************************");
    	Stream.of(arr).distinct().forEach(System.out::println);
    	System.out.println(Stream.of(arr).distinct().count());
    	System.out.println(Arrays.toString(arr));
    	//5.skip()
    	Stream.of(arr).skip(4).forEach(System.out::println);
    	//6.anyMatch()
    	System.out.println(Stream.of(arr).anyMatch(n->n>25));
    	//7.allMatch()
    	System.out.println(Stream.of(arr).allMatch(n->n>25));
    	//8.noneMatch()
    	System.out.println(Stream.of(arr).noneMatch(n->n>25));
    	//9.findFirst()
    	System.out.println(Stream.of(arr).filter(n->n>25).findFirst().get());
    	
    	
    	Integer[] num= {1,2,3,8,9,9,27,6,7,0,14,12,27,24,30,2,8,11,10,19};
    	List<Integer> numList=Arrays.asList(num);
    	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    	numList.stream().filter(n->n%3==0)
    	.distinct()
    	.skip(2)
    	.limit(2)
    	.forEach(System.out::println);
    	
    	System.out.println("######################################################");
    	
    	numList.stream().sorted().forEach(System.out::println);//Sorted List
    	
    	System.out.println("In Reverse Order");
    	
    	numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    	
    	
    	//Stream of Strings 
    	String[] names= {"Parveen","Banu","Sulthan","Ashik","Saranya","Wahith","Sathis","Arthika","Praveenkumar"};
    	Arrays.stream(names)
    	.filter(s->s.length()>5)
    	.filter(s->s.startsWith("S"))
    	.sorted(Comparator.reverseOrder())
    	.forEach(System.out::println);
    	
    	
    	//Stream of User Defined Object Collection
    	Employee e1=new Employee(338,"Parveen",25000,"Developer","IT");
    	Employee e2=new Employee(347,"Saranya",30000,"Tester","IT");
    	Employee e3=new Employee(349,"Sathis",35000,"Data Analyst","DA");
    	Employee e4=new Employee(340,"Praveenkumar",28000,"Web Developer","Web development");
    	Employee e5=new Employee(304,"Arthika",23000,"Quality Analyst","IT");
    	Employee e6=new Employee(362,"Vishnu",50000,"Fullstack Developer","Fullstack development");
    	
    	
   
    	ArrayList<Employee> empList=new ArrayList<Employee>(Arrays.asList(e1,e2,e3,e4,e5,e6));
    	empList.stream().filter(e->e.getSalary()>25000).forEach(System.out::println);
    	System.out.println("----------------------------------------------");
    	empList.stream().filter(e->e.getDept().equals("IT")).forEach(System.out::println);
    	
    	System.out.println("----------------------------------------------");
    	empList.stream()
    	.filter(e->e.getDept().equals("IT"))
    	.sorted((e11,e12)->e11.getName().compareTo(e12.getName()))
    	.map(e->e.getName())
    	.forEach(System.out::println);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
