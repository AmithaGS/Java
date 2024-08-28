package com.xworkz.inheritance.store;

public class SmartPhone {
	public String name;    //properties
	public double price;
	public int gb;
	public boolean isTouchScreen;
	
	public SmartPhone() {
		System.out.println("smart phone is created with no arguments..");
	}
	//methods
	public void name() {
		System.out.println("name is running on smart phone");
		System.out.println("smart phone name is :"+name);
		System.out.println("smart phone price is :"+price);
		System.out.println("smart phone gb is :"+gb);
		System.out.println("smart phone is :"+isTouchScreen);
		}
	
	 public void SmartPhonePrice() {
		System.out.println("price is created ..");
	}
}
