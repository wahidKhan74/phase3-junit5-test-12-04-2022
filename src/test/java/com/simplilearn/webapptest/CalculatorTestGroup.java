package com.simplilearn.webapptest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTestGroup {

	Calculator calc;

	@BeforeEach
	public void setUp() {
		calc = new Calculator();
	}

	@AfterEach
	public void cleanUp() {
		calc = null;
	}
	
	@Nested
	@DisplayName("Addition Group")
	class Add {
		
		@Test
		@DisplayName("Addition Test :: +ve number")
		public void testAdd1() {
			int expected = 700;
			int actual = calc.add(500, 200);
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Addition Test :: +ve & -ve number")
		public void testAdd2() {
			int expected = -300;
			int actual = calc.add(-500, 200);
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Addition Test :: -ve number")
		public void testAdd3() {
			int expected = -700;
			int actual = calc.add(-500, -200);
			Assertions.assertEquals(expected, actual);
		}		
	}
	
	@Nested
	@DisplayName("Substraction Group")
	class Sub {
		
		@Test
		@DisplayName("Substraction Test :: +ve number")
		public void testSub1() {
			int expected = 300;
			int actual = calc.sub(500, 200);
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Substraction Test :: -ve & +ve number ")
		public void testSub2() {
			int expected = 0;
			int actual = calc.sub(-500, 200);
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Substraction Test :: +ve & -ve number ")
		public void testSub3() {
			int expected = 0;
			int actual = calc.sub(500, -200);
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Substraction Test :: -ve number ")
		public void testSub4() {
			int expected = 0;
			int actual = calc.sub(-500, -200);
			Assertions.assertEquals(expected, actual);
		}
	}
	
}
