package com.advanceJava.MultiThreading;

public class MultiThreading {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
		
		t1.setName("Amitha");
		t1.setPriority(3);
		System.out.println(t1);
	}
}
