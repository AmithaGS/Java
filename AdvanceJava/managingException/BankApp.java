package com.advanceJava.managingException;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("connection to main server established.");
		Bank bank = new Bank();
		bank.initiate();
		System.out.println("connection to main server terminated.");
	}
}
