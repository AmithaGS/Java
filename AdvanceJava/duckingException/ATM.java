package com.advanceJava.duckingException;

import java.util.Scanner;

public class ATM {
	public void login() throws Exception{
		System.out.println("Connection to DB established");
		try {
		System.out.println("Enter user id and password numbers to divide and login");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a/b;
		System.out.println("Logged in...");
		}
		finally {
		System.out.println("Connection to DB terminated");
		}
	}
}
