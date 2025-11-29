package com.mphasis;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		while(true) {
			System.out.println("Object Creating");
			MyClass.listItems.add(new int[100]);//OutOf memory Error
		}

	}
}
class MyClass{
	
	static List<int[]> listItems=new ArrayList<int[]>();
	
}
