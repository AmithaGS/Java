package com.advanceJava.Synchronize;

public class SynchronizeDemo {
	public static void main(String[] args) throws InterruptedException {
		BathRoom bathroom = new BathRoom();
		
		Thread t1 = new Thread(bathroom);
		Thread t2 = new Thread(bathroom);
		Thread t3 = new Thread(bathroom);
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("OTHER");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
