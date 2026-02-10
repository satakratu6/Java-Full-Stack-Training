package com.capg.java;
import com.capg.java.Calculation;
import junit.framework.TestCase;
public class CalculationTest extends TestCase{
	public void testAdd() {
		assertEquals(5, new Calculation().addition(3, 2));
		assertEquals(6, new Calculation().subtraction(11, 5));
		assertEquals(55, new Calculation().multiplication(11, 5));
		assertEquals(10, new Calculation().division(100, 10));

	}
}
