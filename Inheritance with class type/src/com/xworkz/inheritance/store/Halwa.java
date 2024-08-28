package com.xworkz.inheritance.store;

public class Halwa {
	public String name;
	public double price;
	public boolean isSweety;
	
	public Halwa() {
		System.out.println("halwa is created with no arguments ..");
	}
	
	public void sweetName() {
		System.out.println("sweet name is :"+name);
		System.out.println("sweet price is :"+price);
		System.out.println("sweet is :"+isSweety);
		System.out.println("sweet name is created");
	}
	
	public void sweetPrice() {
		System.out.println("price is created");
	}
}
