package com.simplilearn.webapptest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AgeCalculatorTest {

	AgeCalculator ac;
	
	@BeforeEach
	void setUp() throws Exception {
		ac = new AgeCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		ac = null;
	}

	@Test
	@DisplayName("Test Age Calculation +ve year")
	void testAge() {
		assertEquals(29, ac.ageCalculate(1993));
		assertEquals(28, ac.ageCalculate(1994));
		assertEquals(32, ac.ageCalculate(1990));
	}
	
	@Test
	@DisplayName("Test Age Calculation zero year")
	void testAge1() {
		assertEquals(2022, ac.ageCalculate(0));
	}

}
