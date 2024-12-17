package com.advanceJava.MultiThreading;

public class Print {
	void doActivity() {
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
}
