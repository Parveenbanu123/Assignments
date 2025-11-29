package com.mphasis;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		assertEquals(13, new Calculator().add(10, 3));
	}
	
	@Test
	public void subTest() {
		assertEquals(7, new Calculator().sub(10, 3));
	}
	
	@Test
	public void mulTest() {
		assertEquals(30, new Calculator().mul(10, 3));
	}
	
	@Test
	public void divTest() {
		assertEquals(3, new Calculator().div(10, 3));
	}
	
	@Test
	public void modTest() {
		assertEquals(1, new Calculator().mod(10, 3));
	}
	
	@Test
	public void isEvenTest() {
		assertTrue(new Calculator().isEven(4),"for input 4 result must be true");
	}
	
	@Test
	public void checkArrayTest() {
		int brr[]= {1,2,3,4,5};
		assertArrayEquals( new Calculator().checkArrays(),brr);
		//assertSame(new Calculator().checkArrays(), brr);//comparing references of two arrays
	}
	
	@Test
	public void checkArithmeticException() {
		assertTrue( new Calculator().checkAE() instanceof ArithmeticException);
		
	}
	
	
	
}
