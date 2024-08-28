package com.xworkz.inheritance.store;

public class Bulb {
	public double price;     //property
	
	public Bulb() {
		System.out.println("bulb is created with no arguments ..");
	}
	
	public void light() {
		System.out.println("light is running on bulb");
		System.out.println("bulb price is :"+price);
	}
}
