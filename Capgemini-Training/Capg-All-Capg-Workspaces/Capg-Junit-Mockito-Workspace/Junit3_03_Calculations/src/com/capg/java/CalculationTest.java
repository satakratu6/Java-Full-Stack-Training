package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase {
	Calculator calculation;
	//Runs before each test method
	
	protected void setUp() {
		calculation =new Calculator();
	}
	
	//test method (name must start with 'test')
	
	public void testAll() {
		int result=calculation.addition(2, 3);
		assertEquals(5, result);
		assertEquals(10, calculation.subtraction(15, 5));
		assertEquals(10, calculation.multiplication(2, 5));
		assertEquals(5, calculation.division(10, 2));
		
	}
	
	//runs after each test method
	protected void tearDown() {
		calculation=null;
	}
}



