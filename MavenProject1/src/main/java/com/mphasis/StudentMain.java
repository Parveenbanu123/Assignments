package com.mphasis;


public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(123,"Banu",80,22);
		Student.College c1=new Student.College("abc","pune",1234);
		
		System.out.println(s1+" "+c1);
		
		Student s2=new Student(12,"Parveen",80,22);
		Student.College c2=new Student.College("xyz","pune",4567);
		
		System.out.println(s2+" "+c2);
		
		

	}

}
