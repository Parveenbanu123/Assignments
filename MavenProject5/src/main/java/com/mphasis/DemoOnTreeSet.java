package com.mphasis;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {
//		TreeSet<Integer> ts=new TreeSet<Integer>();
//		ts.add(12);
//		ts.add(34);
//		ts.add(90);
//		ts.add(49);
//		ts.add(38);
//		ts.add(23);
//		ts.add(85);
//		ts.add(7);
//		System.out.println(ts);
//		System.out.println(ts.ceiling(90));//23 ceiling(last element) is last element only
//		System.out.println(ts.floor(84));//49
//		Iterator<Integer> itr=ts.descendingIterator();
//		while(itr.hasNext())
//			System.out.print(itr.next()+"  ");
//		System.out.println(ts.headSet(23));//not include the element
//		System.out.println(ts.tailSet(38));//includes the element
//		System.out.println(ts.higher(38));//higher(last element) is null
		
		TreeSet<Student> studentTree=new TreeSet<Student>();
		studentTree.add(new Student(1,"Parveen",22,"CBE",80.70));
		studentTree.add(new Student(2,"Saranya",21,"Erode",80.40));
		studentTree.add(new Student(3,"Sathis",22,"DPM",80.20));
		studentTree.add(new Student(4,"Ashik",24,"CBE",85.70));
		studentTree.add(new Student(5,"Wahith",14,"CBE",70.70));
		
		for(Student s:studentTree)
			System.out.println(s);
		//System.out.println(studentTree);
		
	}

}
