package com.mphasis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {
	public static void main(String[] args) {
//		ArrayList alist=new ArrayList();
//		alist.add(10);
//		alist.add("Parveen");
//		alist.add(true);
//		alist.add(38.49);
//		Person p=new Person("Parveen", 338);
//		alist.add(p);
//		alist.add('c');
//		System.out.println(alist);
//		System.out.println(alist.get(2)); //internally random access happen
//		alist.add('c');
//		alist.add(null);
//		System.out.println(alist);
//		
//		ArrayList<String> nameList=new ArrayList<>();
//		nameList.add("Parveen");
//		nameList.add("Banu");
//		nameList.add("Saranya");
//		nameList.add("Arthika");
//		nameList.add("Ashik");
//		nameList.add("Wahith");
//		System.out.println(nameList);
//		for(String s:nameList) 
//			System.out.println(s);
//		System.out.println("Using Iterator:");
//		Iterator<String> itr=nameList.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("List Iterator");
//		ListIterator<String> litr=nameList.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
//		System.out.println("Backward direction:");
//		while(litr.hasPrevious()) {
//			System.out.println(litr.previous());
//		}
//		
//		System.out.println(alist.contains("Parveen"));//true
//		System.out.println("ForEach");
//		nameList.forEach(name->System.out.println(name));//consumer using lambda
//		nameList.forEach(System.out::println);//consumer using method reference
//		
//		System.out.println(nameList.remove(1));
//		//System.out.println(nameList.remove("Parveen"));
//		System.out.println(nameList);
//		
//		Integer[] arr= {2,3,4,5,6,7,9,1,89};
//		Integer[] arr1= {2,3,4,5,6,8};
//		
//		List<Integer> numList1=new ArrayList<Integer>(Arrays.asList(arr));
//		List<Integer> numList2=new ArrayList<Integer>(Arrays.asList(arr1));
//		System.out.println("Before retain "+numList1);
//		System.out.println(numList1.retainAll(numList2));
//		System.out.println("After retain "+numList1);
//		//System.out.println("After retain "+numList2);
//		nameList.add("parveen");
//		System.out.println(nameList);
//		Collections.sort(nameList);//utility class--Collections , sort based on ASCII
//		System.out.println(nameList);
//		
//		ArrayList<String> clonedNameList=(ArrayList<String>) nameList.clone();
//		System.out.println(clonedNameList);
//		System.out.println(nameList.hashCode()+" "+clonedNameList.hashCode()); // Same hash code
//		
//		
//		clonedNameList.add("Banu");
//		System.out.println(clonedNameList+" "+clonedNameList.hashCode());//if cloned list modified,hash code will change
//		
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(123,"Parveen",22,"CBE",89.70));
		studentList.add(new Student(134,"Parveen",22,"CBE",88.70));
		studentList.add(new Student(125,"Parveen",22,"CBE",80.50));
		studentList.add(new Student(167,"Parveen",22,"CBE",80.40));
		studentList.add(new Student(189,"Parveen",22,"CBE",80.30));
		
		studentList.add(new Student(1,"Parveen",22,"CBE",80.70));
		studentList.add(new Student(2,"Saranya",21,"Erode",80.40));
		studentList.add(new Student(3,"Sathis",22,"DPM",80.20));
		studentList.add(new Student(4,"Ashik",24,"CBE",85.70));
		studentList.add(new Student(5,"Wahith",14,"CBE",70.70));
		
		studentList.add(new Student(12,"Banu",22,"CBE",81.70));
		studentList.add(new Student(22,"Saranya",21,"Erode",80.40));
		studentList.add(new Student(32,"Sathis",22,"DPM",80.20));
		studentList.add(new Student(42,"Mohammed Ashik",24,"CBE",86.70));
		studentList.add(new Student(52,"Mohammed Wahith",14,"CBE",71.70));
		
		studentList.add(new Student(13,"Fathima",22,"CBE",82.70));
		studentList.add(new Student(23,"Saranya",21,"Erode",80.40));
		studentList.add(new Student(33,"Sathis",22,"DPM",80.20));
		studentList.add(new Student(43,"Md Ashik",24,"CBE",87.70));
		studentList.add(new Student(53,"Md Wahith",14,"CBE",72.70));
		
//		for(Student s:studentList)
//			System.out.println(s);
//		
		//Collections.sort(studentList);
		studentList.sort(new CityComparator().thenComparing(new NameComparator()).thenComparing(new MarkComparator()));
		System.out.println();
//		System.out.println(studentList);
		for(Student s:studentList)
			System.out.println(s);
		
	}
}
