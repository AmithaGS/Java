package com.advanceJava.CustomException;

import java.util.Scanner;

public class ATM {
	String pin ="1111";
	
	void withDraw() throws InvalidPinException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin:");
		String upin = sc.next();
		if (upin.equals(pin)) {
			System.out.println("TAKE ALL THE MONEY IN ATM...");
		} 
		else {
			// customException generation
			InvalidPinException ipe = new InvalidPinException();
			System.out.println(ipe.getMessage());
			throw ipe;
		}
	}
}
