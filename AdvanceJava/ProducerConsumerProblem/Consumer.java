package com.advanceJava.Multithread.pc;

public class Consumer extends Thread {
	Factory ref;

	public Consumer(Factory ref) {
		this.ref = ref;
	}
	
	public void run () {
		while (true) {
			ref.consumeData();
		}
	}
}