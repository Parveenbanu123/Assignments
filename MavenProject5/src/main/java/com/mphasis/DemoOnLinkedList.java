package com.mphasis;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		//FIFO
		Integer[] irr= {45,56,7,8,89,90,12,32,38,49,50};
		LinkedList<Integer> ll=new LinkedList<Integer>( Arrays.asList(irr));
		//System.out.println(ll);
		
		Iterator<Integer> itr=ll.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(ll.offer(100)); // adds element at tail(last position)
		System.out.println(ll.offerFirst(338));// adds element at head(first position)
		System.out.println(ll.peek());//retrieves head element but not remove
		System.out.println(ll.pop());//removes & returns the head element --NoSuchElementException-if empty list
		System.out.println(ll.poll());//removes & returns the head element --NULL-if empty list
		//ll.reversed()--only work with java 21+ versions
		Iterator<Integer> ditr=ll.descendingIterator();
		while(ditr.hasNext()) {
			System.out.println(ditr.next());
		}
		//System.out.println(ll);
		System.out.println(ll.subList(0, 3));//inclusive,exclusive 56,7,8 (0,1,2)


		


		
	}

}
