package com.mphasis;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v.capacity()); //initial capacity of vector is 10
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v.capacity());
		v.add(11);
		System.out.println(v.capacity());//doubled the size when capacity reaches maximum
		System.out.println("Using Enumeration");
		Enumeration<Integer> enums=v.elements();
		while(enums.hasMoreElements())
			System.out.println(enums.nextElement());
		System.out.println("Using Iterator");
		Iterator<Integer> itr=v.iterator();
		while(itr.hasNext()) {
			int n=itr.next();
			if(n%3==0)
				itr.remove();
			System.out.println(n);
		}
		System.out.println(v);
	}

}
