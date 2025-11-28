package com.mphasis;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int op1,op2;
		char operator;
		System.out.println("Enter two numbers:");
		op1=sc.nextInt();
		op2=sc.nextInt();
		System.out.println("Enter an arithmetic operator:");
		operator=sc.next().charAt(0);
		switch(operator) {
		case '+':
			System.out.println("Addition: "+op1+op2);
			break;
		case '-':
			System.out.println("Subtraction: "+(op1-op2));
			break;
		case '*':
			System.out.println("Multiplication: "+op1*op2);
			break;
		case '/':
			System.out.println("Division: "+(float)op1/op2);
			break;
		case '%':
			System.out.println("Mod: "+op1%op2);
			break;
		default:
			System.out.println("Not a valid operation");
		}

	}

}
