package com.advanceJava.Multithread.pc;

public class Producer extends Thread {
	Factory ref;

	public Producer(Factory ref) {
		this.ref = ref;
	}
	
	public void run () {
		int x = 1;
		while (true) {
			ref.produceData(++x);
		}
	}
}