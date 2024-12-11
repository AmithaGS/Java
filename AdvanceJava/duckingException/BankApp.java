package com.advanceJava.duckingException;

public class BankApp {
	public static void main(String[] args) {
		System.out.println("connection to main server established.");
		try {
		Bank bank = new Bank();
		bank.initiate();
		}
		catch (Exception e) {
			System.out.println("Exception reached main and handeled in main..");
		}
		System.out.println("connection to main server terminated.");
	}
}
