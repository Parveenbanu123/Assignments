package com.mphasis;

public class StackUsingArray {

	private static int[] myStack=new int[10];
	private static int top=-1;
	
	
	public static boolean isEmpty() {
		return top==-1;
	}
	
	public static boolean isFull() {
		return top==10;
	}
	
	public static void push(int ele) {
		if(isFull()) 
			System.out.println("Stack Overflow");	
		else
			myStack[++top]=ele;
	}
	
	public static void  pop() {
		if(isEmpty()) 
			System.out.println("Stack Underflow");
		else
			System.out.println("popped element: "+myStack[top--]);
	}
	
	public static void peek() {
		if(isEmpty())
			System.out.println("No elements");
		else
			System.out.println("peek element: "+myStack[top]);
	}
	
	public static void display() {
		for(int i:myStack)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		pop();
		push(10);
		display();
		peek();
		pop();
		peek();
	}

}
