package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase {
	Calculation calculation;
	//Runs before each test method
	
	protected void setUp() {
		calculation =new Calculation();
	}
	
	//test method (name m start with 'test')
	
	public void testAdd() {
		int result=calculation.addition(2, 3);
		assertEquals(5, result);
	}
	
	//runs after each test method
	protected void tearDown() {
		calculation=null;
	}
}
