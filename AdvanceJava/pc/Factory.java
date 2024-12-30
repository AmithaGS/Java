package com.advanceJava.Multithread.pc;

public class Factory {
	int x;
	boolean dataPresent = false;
	
	synchronized void produceData (int i) {
		try {
			if (dataPresent == true) {
				wait();
			}
			x = i;
			System.out.println("I have produced " + x + " in factory");
			dataPresent = true;
			notify();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized void consumeData () {
		try {
			if (dataPresent == false) {
				wait();
			} 
			System.out.println("I Have consumed " + x + " from factory");
			dataPresent = false;
			notify();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
