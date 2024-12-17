package com.advanceJava.MultiThreading;

public class Add {
	void doActivity() {
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
