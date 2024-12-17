package com.advanceJava.MultiThreading;

public class SingleThreadMain {

	public static void main(String[] args) {
		new Login().doActivity();
		new Print().doActivity();
		new Add().doActivity();
	}

}
