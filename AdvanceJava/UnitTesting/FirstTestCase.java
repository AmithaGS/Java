package com.advanceJava.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTestCase {

	@Test
	void test() {
		
		Calculator calculator = new Calculator();
		int result = calculator.add(10, 20);
	
		assertEquals(30, result); 
	}

}
