package com.mphasis;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(34);
		hashSet.add(67);
		hashSet.add(36);
		hashSet.add(58);
		hashSet.add(49);
		hashSet.add(38);
		hashSet.add(null);
		hashSet.add(null);
		//System.out.println(hashSet);
//		for(int i:hashSet)
//			System.out.println(i);
//		Iterator itr=hashSet.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());

		hashSet.forEach(System.out::println);
		System.out.println(hashSet);
		
		
		LinkedHashSet<Integer> llhs=new LinkedHashSet<Integer>();
		llhs.add(90);
		llhs.add(88);
		llhs.add(76);
		llhs.add(67);
		llhs.add(38);
		llhs.add(49);
		llhs.add(80);
		System.out.println(llhs);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
