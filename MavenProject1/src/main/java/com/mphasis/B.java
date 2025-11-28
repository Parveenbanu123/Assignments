package com.mphasis;

public interface B {
	public default void method1() {
		System.out.println("From B");
	}
}
