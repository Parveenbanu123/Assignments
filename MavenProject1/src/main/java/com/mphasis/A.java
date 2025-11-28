package com.mphasis;

public interface A {
	public  default void method1() {
		System.out.println("From A");
	}
}
