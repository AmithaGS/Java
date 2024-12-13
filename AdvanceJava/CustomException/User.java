package com.advanceJava.CustomException;

import java.util.Scanner;

public class User {
	void register() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		if (age >= 21 && age <= 50) {
			System.out.println("Regristration sucessful..");
		} else if (age < 21) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		} else {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
	}
}
