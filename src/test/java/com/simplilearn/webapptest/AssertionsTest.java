package com.simplilearn.webapptest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

	String firstName="John";
	String lastName=null;
	int age = 35;
	String[] family = {"Mike","David","Marry","William"};
	String[] names = {"Mike","David","Marry","William"};
	int[] numbers= {10,20,30};
	int[] values = {10,20,30};
	
	@Test
	@DisplayName("Test Assert Equal")
	public void testAssertEqual() {
		assertEquals(firstName, "John");
		assertEquals(age, 35);
		assertEquals(lastName, null);
		assertEquals(true, true);
		assertArrayEquals(family, names);
	}
	
	@Test
	@DisplayName("Test Assert True and False")
	public void testAssertTrueAndFalse(){
		assertTrue(true);
		assertFalse(false);
		assertTrue(1000> 500);
		assertFalse(1000> 5000);
	}
	
	@Test
	@DisplayName("Test Assert Null and Not Null")
	public void testAssertNullNotNull(){ 
		
		assertNull(lastName);
		assertNotNull(firstName);
		assertNotNull(family);		
		assertNotNull(age);
	}
	
	
	
}
