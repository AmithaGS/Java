package com.advanceJava.rethrowingException;

import java.util.Scanner;

public class ATM {
	public void login() throws Exception{
		System.out.println("Connection to DB established");
		System.out.println("Enter user id and password numbers to divide and login");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		try {
		int c = a/b;
		System.out.println("Logged in...");
		}
		catch (Exception e) {
			System.out.println("Issue resolved in ATM..");
			throw e;
		}
		finally {
		System.out.println("Connection to DB terminated");
		}
	}
}
