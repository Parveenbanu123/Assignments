package com.mphasis;

import java.util.Arrays;
import java.util.List;

public class DemoOnGenerics {

	public static <T> void display(T data) {
		
		System.out.println("Data is "+data);
	}
	
	public static <T extends Number,U extends Number> void add(T t1,U u1) {//bounded types bcaz of extends
		System.out.println(t1+" "+u1);
		System.out.println(t1.intValue()+u1.intValue());
	}
	public static void main(String[] args) {
		 
//		Container<String> c1=new Container<String>();
//		c1.setItems("Parveen");
//		System.out.println(c1.getItems());
//		
//		
//		Container<Student> c2=new Container<Student>();
//		Student s1=new Student();
//		c2.setItems(s1);
//		System.out.println(c2.getItems());
//		
//		 
//		Container<Integer> c3=new Container<Integer>();
//		c3.setItems(22);
//		System.out.println(c3.getItems());
//		
//		
//		Container<Integer[]> c4=new Container<Integer[]>();
//		Integer[] arr= {45,56,76,89,38,49,90};
//		c4.setItems(arr);
//		System.out.println(Arrays.toString(c4.getItems()));
		
		
//		Pair<String,Double> p1=new Pair<String,Double>("distance in km",7.5);
//		System.out.println(p1);
//		Pair<String,Double> p2=new Pair<String,Double>("weight in kg",6.8);
//		System.out.println(p2);
//		
//		Pair<Integer,String> p3=new Pair<Integer,String>(12345,"Laptop");
//		System.out.println(p3);
//		
//		Student s=new Student(1,"Parveen","CSE");
//		Pair<Integer,Student>p4=new Pair<Integer,Student>(1,s);
//		System.out.println(p4);
//		System.out.println(p4.getValue());
		
		 
//		Order<String> o1=new Order<String>("Laptop");
//		Order<String> o2=new Order<String>("Mobile");
//		System.out.println(o1);
//		System.out.println(o2);
//		
//		Item item=new Item(12,"Laptop",60000);
//		Item item1=new Item(23,"Mobile",40000);
//		Item item2=new Item(34,"Watch",10000);
//		
//		Order<Item> o3=new Order<Item>(item);
//		System.out.println(o3);
//		
//		Item[] arr= {item,item1,item2};
//		Order<Item[]> o4=new Order<Item[]>(arr);
//		System.out.println(Arrays.toString(o4.getItem()));
//		System.out.println(o4); //Object[] in toString() we explicitly writing 
//		
//		List<Item> itemList=Arrays.asList(arr);
//		Order<List<Item>> o5=new Order<List<Item>>(itemList);
//		System.out.println(o5);
//		
//		
//		Integer[] nums= {1,4,7,5,8,9,3,2,10};
//		String strs[]= {"str1","str2","str3","str4","str5"};
//		ArrayPrinter<Integer> ap=new ArrayPrinter<>(nums);
//		ArrayPrinter<String> ap1=new ArrayPrinter<>(strs);
//		
//		System.out.println(ap);
//		System.out.println(ap1);
		
		
		display("Hello!!!");
		display("Parveen");
		display(338);
		display(2.78);
		Item i=new Item(11,"Mobile",30000);
		display(i);
		
		add(1,2);
		
		add(1.3,5.8);
		
		
		
		
		
	}

}
