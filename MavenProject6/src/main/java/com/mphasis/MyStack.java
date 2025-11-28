package com.mphasis;

import java.util.Scanner;

public class MyStack {
	
	private static Node top=null;
	
	public static boolean isEmpty() {
		return top==null;
	}
	
	public static Node createNode() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data to be inserted:");
		int data=sc.nextInt();
		return new Node(data);
		 
	}
	
	public static void push() {
		Node newNode=createNode();
		if(isEmpty()) {
			top=newNode;
		}
		else {
			newNode.setNext(top);
			top=newNode;
		}
		System.out.println(newNode.getData()+" inserted into stack successfully");
	}
	
	public static void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
		}
		else {
			System.out.println(top.getData()+" popped up from stack");
			Node temp=top;
			top=top.getNext();
			temp.setNext(null);
		}
	}
	
	public static void display() {
		if(isEmpty()) {
			System.out.println("No Element in the stack");
		}
		else {
			Node temp=top;
			while(temp!=null) {
				System.out.print(temp.getData()+"-->");
				temp=temp.getNext();
			}
			System.out.print("null");
			System.out.println();
		}
	}
}
