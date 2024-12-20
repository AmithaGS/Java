package com.advanceJava.exception.inheritance;

public class DemoApp {

	public static void main(String[] args) {
		try {
		new Demo2().alpha();
		}
		catch (NegativeArraySizeException e) {
			System.out.println("Out");
			e.printStackTrace();    // is used to handle the exceptions and errors
		}
	}

}
