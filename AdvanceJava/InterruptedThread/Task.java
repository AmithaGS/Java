package com.advanceJava.InterruptedThread;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Kodnest");
		try {
		Thread.sleep(20000); 
		System.out.println("After wake up..");
		}
		
		catch (InterruptedException e) {
			System.out.println("THREAD INTERRUPTED.. THREAD IS DEAD....");
			e.printStackTrace();
		}
	}
	
}
