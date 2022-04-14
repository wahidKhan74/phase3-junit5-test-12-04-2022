package com.simplilearn.webapptest;

public class AgeCalculator {

	// calculate age
	public int ageCalculate(int yearOfBirth) {
		int currentYear = 2022;
		int age = currentYear - yearOfBirth;
		return age;
	}
	
	// calculate retirement
	public boolean isRetired(int yearOfBirth) {
		int age = ageCalculate(yearOfBirth);
		if(age>60) {
			return true;
		}
		return false;
	}
}
