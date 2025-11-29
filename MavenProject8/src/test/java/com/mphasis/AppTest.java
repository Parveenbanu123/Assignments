package com.mphasis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void sayHelloTest() {
    	
    	String expected="Hello";
    	String actual=new App().sayHello();
    	assertEquals(expected, actual);
    }
    
    @Test
    public void checkTest() {
    	assertNotNull(new App().checkText());
    	
    	
    }
    @BeforeAll
	public static void beforeEveryTest() {
		System.out.println("Testing of API started");
	}
    
    @AfterAll
    public static void afterEach() {
    	System.out.println("Testing of API completed");
    }
    
    
   
}
