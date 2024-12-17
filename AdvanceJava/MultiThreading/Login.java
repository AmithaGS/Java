package com.advanceJava.MultiThreading;

import java.util.Scanner;

public class Login {
	void doActivity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("LOGGIN ACTIVITY STARTED");
		System.out.println("Enter Username:");
		String name = sc.next();
		
		System.out.println("Enter password:");
		String pwd = sc.next();
		System.out.println("LOGGIN SUCCESSFULLY");
		System.out.println("LOGGIN ACTIVITY ENDED");
	}
}
