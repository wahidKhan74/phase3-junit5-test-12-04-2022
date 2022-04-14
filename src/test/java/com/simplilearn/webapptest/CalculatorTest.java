package com.simplilearn.webapptest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Operation Test")
public class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}
	
	@AfterEach
	public void cleanUp() {
		calculator = null;
	}
	
	@Test
	@DisplayName("Addition Test :: +ve number")
	public void testAdd1() {
		int expected = 700;
		int actual = calculator.add(500, 200);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Addition Test :: +ve & -ve number")
	public void testAdd2() {
		int expected = -300;
		int actual = calculator.add(-500, 200);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Addition Test :: -ve number")
	public void testAdd3() {
		int expected = -700;
		int actual = calculator.add(-500, -200);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Substraction Test :: +ve number")
	public void testSub1() {
		int expected = 300;
		int actual = calculator.sub(500, 200);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Substraction Test :: -ve & +ve number ")
	public void testSub2() {
		int expected = 0;
		int actual = calculator.sub(-500, 200);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Substraction Test :: +ve & -ve number ")
	public void testSub3() {
		int expected = 0;
		int actual = calculator.sub(500, -200);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Substraction Test :: -ve number ")
	public void testSub4() {
		int expected = 0;
		int actual = calculator.sub(-500, -200);
		Assertions.assertEquals(expected, actual);
	}
}
