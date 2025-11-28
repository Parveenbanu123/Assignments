package com.mphasis;

public class MyQueueArray {
	
	private static int front=-1;
	private static int rear=-1;
	private static int[] queue=new int[10];
	
	
	public static boolean isEmpty() {
		if(front==-1||front>rear)
			return true;
		return false;
	}
	private static boolean isFull() {
		return (rear==queue.length-1);
	}
	public static void insert(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else if(rear==-1) {
			front=0;
			queue[++rear]=data;
		}
		else {
			queue[++rear]=data;
		}
		System.out.println(data+" inserted");
	}
	
	public static void delete() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			front=rear=-1;
		}
		else {
			System.out.println("Element deleted: "+queue[front++]);
			if(front>rear)
				front=rear=-1;
		}
			
	}
	private static void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty Can't display anything");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.print(queue[i]+" ");
			}
		}
		System.out.println();

	}
	public static void main(String[] args) {
		delete();
		insert(10);
		display();
		
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		display();
		delete();
		display();
	}
	
	
	
	
}
