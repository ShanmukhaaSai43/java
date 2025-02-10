package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	//Creating an instance of Calculator
	private final Calculator calculator = new Calculator();
	
	
	// Testing methods with positive numbers
	@Test
	public void testAdd() {
		int result = calculator.addition(5, 8);
		 assertEquals(13, result);
	}
	@Test
	public void testSubstract() {
		int result = calculator.subtract(18, 7);
		 assertEquals(11, result);
	}
	
	
	// Testing addition with negative numbers
	@Test
	public void testAddWithNegativeNumbers() {
		int result = calculator.addition(-1, -9);
		 assertEquals(-10, result);
	}

	@Test
	public void testSubstractWithNegativeNumbers() {
		int result = calculator.subtract(-6, -3);
		 assertEquals(-3, result);
	}


}
