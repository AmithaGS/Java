package com.advanceJava.rethrowingException;

public class Bank {
	public void initiate() {
		try {
		System.out.println("connection to bank server estalished");
		ATM atm = new ATM();
		atm.login();
		}
		catch (Exception e) {
			System.out.println("Issued reached bank and resolved in bank");
		}
		System.out.println("connection to bank server terminated");
	}
}
