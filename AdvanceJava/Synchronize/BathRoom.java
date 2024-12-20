/* To prevent the threads from interfering with each other, so java provides synchronized keyword 
              that access of multiple threads to any shared resources.
         synchronized keyword : is ensures only one thread can access a piece of code at a time */

package com.advanceJava.Synchronize;

public class BathRoom implements Runnable {

	@Override
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " IS ENTERING TO BATHROOM");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " IS USING BATHROOM");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " IS EXITING BATHROOM");
			Thread.sleep(5000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
