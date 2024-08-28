package com.xworkz.inheritance.store;

public class Chicken {
	public String type;
	public double price;
	public double weight;
	public boolean egg;
	public char gender;
	public String itemName;
	public double itemPrice;
	public int itemQuantity;
	public String farmName;
	public int farmProfit;
	
	public Chicken() {

		System.out.println("chicken constructor is created");
	}
	public void chickenDetails() {
		System.out.println("chicken type: "+type);
		System.out.println("chicken price: "+price);
	}
	public void meat() {
		System.out.println("chicken weight: "+weight);
		System.out.println("chicken egg: "+egg);
	}
	public void boil() {
		System.out.println("chicken gender: "+gender);
		System.out.println("chicken itemName: "+itemName);
	}
	public void item() {
		System.out.println("chicken itemPrice: "+itemPrice);
		System.out.println("chicken itemQuantity: "+itemQuantity);
	}
	
	public void farmDetails() {
		System.out.println("chicken farmName: "+farmName);
		System.out.println("chicken farmProfit: "+farmProfit);
	}
	

}

