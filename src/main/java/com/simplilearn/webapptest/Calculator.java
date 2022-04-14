package com.simplilearn.webapptest;

public class Calculator {

	// addition
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// subtraction
	public int sub(int num1, int num2) {
		if(num1> 0 && num2> 0 && num1 > num2) {
			return num1-num2;
		}
		return 0;
	}
	
	// multiplication
	// division
	// avg
}
