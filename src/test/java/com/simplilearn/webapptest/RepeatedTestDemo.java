package com.simplilearn.webapptest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {

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
	@RepeatedTest(4)
	void testAge() {
		assertEquals(29, ac.ageCalculate(1993));
		assertEquals(28, ac.ageCalculate(1994));
		assertEquals(32, ac.ageCalculate(1990));
	}
	
	
	@Test
	@DisplayName("Calculate Age")
	@RepeatedTest(value=3, name="{displayName} - repetition {currentRepetition} of {totalRepetitions}")
	void calculateAge() {
		assertEquals(29, ac.ageCalculate(1993));
		assertEquals(28, ac.ageCalculate(1994));
		assertEquals(32, ac.ageCalculate(1990));
	}
	
	@Test
	@DisplayName("Test Age Long")
	@RepeatedTest(value=3, name=RepeatedTest.LONG_DISPLAY_NAME)
	void calculateAge1() {
		assertEquals(29, ac.ageCalculate(1993));
		assertEquals(28, ac.ageCalculate(1994));
		assertEquals(32, ac.ageCalculate(1990));
	}
	
	@Test
	@DisplayName("Test Age Short")
	@RepeatedTest(value=3, name=RepeatedTest.SHORT_DISPLAY_NAME)
	void calculateAge2() {
		assertEquals(29, ac.ageCalculate(1993));
		assertEquals(28, ac.ageCalculate(1994));
		assertEquals(32, ac.ageCalculate(1990));
	}
	
}
