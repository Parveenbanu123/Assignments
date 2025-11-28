package com.mphasis;

public class CircularQueueUsingArray {
	
	private static int front=-1;
	private static int rear=-1;
	private static int[] cq=new int[5];
	
	public static boolean isEmpty() {
		return front==-1;
	}
	private static boolean isFull() {
		return front==((rear+1)%cq.length);
	}
	public static void insert(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(rear==-1)
				front=0;
			rear=(rear+1)%cq.length;
			cq[rear]=data;
			System.out.println(data+" inserted");
		}
		
	}
	
	public static void delete() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			//front=rear=-1;
		}
		else {
			System.out.println("Element deleted: "+cq[front]);
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%cq.length;
		}
			
	}
	private static void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty Can't display anything");
		}
		else {
			int i=front;
			while(true) {
				System.out.println(i+" "+cq[i]+" ");
				if(i==rear)
					break;
				i=(i+1)%cq.length;	
			}
		}
		System.out.println();

	}
	public static void main(String[] args) {
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		display();
		delete();
		insert(10);
		display();
		delete();
		display();
		insert(3);
		display();
	}
	
}
