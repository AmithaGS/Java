package com.advanceJava.duckingException;

public class Bank {
	public void initiate() throws Exception{
		try {
		System.out.println("connection to bank server estalished");
		ATM atm = new ATM();
		atm.login();
		System.out.println("Issued reached bank and resolved in bank");
		}
		finally {
		System.out.println("connection to bank server terminated");
		}
	}
}
