package com.advanceJava.managingException;

public class Bank {
	public void initiate() {
		System.out.println("connection to bank server estalished");
		ATM atm = new ATM();
		atm.login();
		System.out.println("connection to bank server terminated");
	}
}
