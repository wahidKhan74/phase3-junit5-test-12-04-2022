package com.simplilearn.webapptest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Validator Test")
public class ValidatorTest {

	Validator validator;
	
	
	@BeforeEach
	public void setUp() {
		validator = new Validator();
	}
	
	@AfterEach
	public void cleanUp() {
		validator = null;
	}
	
	@Test
	@DisplayName("Test Age : 30 ")
	public void testAge1() {
		boolean expected = true;
		boolean actual = validator.ageValidate(30);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test Age : 10 ")
	public void testAge2() {
		boolean expected = false;
		boolean actual = validator.ageValidate(10);
		Assertions.assertEquals(expected, actual);
	}
	
	
	@Test
	@DisplayName("Test Age : -110 ")
	public void testAge3() {
		boolean expected = false;
		boolean actual = validator.ageValidate(-110);
		Assertions.assertEquals(expected, actual);
	}
}
