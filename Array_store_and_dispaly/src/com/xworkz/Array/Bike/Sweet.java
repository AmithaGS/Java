package com.xworkz.Array.Bike;

public class Sweet {
	private String sweets[] = new String[7];
	private int index=0;
	
	public void sweetStore(String sweetName) {
		sweets[index]=sweetName;
		index++;
	}
	
	public void printSweetDetails() {
		System.out.println("sweet is created");
		for(String sweet : sweets) {
			System.out.println("sweet name is :"+sweet);
		}
	}
}
