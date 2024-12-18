package com.advanceJava.Multithread.usingImplementsRunnable;

import java.util.Scanner;

public class Activity implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("login")) {
			login();
		} else if (name.equals("print")) {
			print();
		} else {
			add();
		}
	}
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("LOGGIN ACTIVITY STARTED");
		System.out.println("Enter Username:");
		String name = sc.next();
		
		System.out.println("Enter password:");
		String pwd = sc.next();
		System.out.println("LOGGIN SUCCESSFULLY");
		System.out.println("LOGGIN ACTIVITY ENDED");
	}
	
	public void print() {
		try {
			System.out.println("PRINTING ACTIVITY STARTED");
			for (int i = 0; i <= 4; i++) {
				System.out.println("Kodnest");
				Thread.sleep(5000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PRINTING ACTIVITY ENDED");
	}

	public void add() {
		try {
			System.out.println("ADDITION ACTIVITY STARTED");
			long l1 = 1235667886l;
			long l2 = 3750725374l;
			long sum = l1 + l2;
			Thread.sleep(5000);
			System.out.println("Addition result: " + sum);
			System.out.println("ADDITION ACTIVITY Ended");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
