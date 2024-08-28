package com.xworkz.inheritance.store;

public class Bull {
	public String location;   //properties
	public String color;
	public double weight;
	public int runSpeed;
	public String hornShape;
	 
	public Bull() {   //constructor
		System.out.println("created non argument bull constructor..");
	}
	
	//methods
	
	public void bullLocation() {
		System.out.println("bull location is :"+location);
	}
	
	public void bullColor() {
		System.out.println("bull color is :"+color);
	}
	public void bullWeight() {
		System.out.println("bull weight is :"+weight);
	}
	public void bullRunSpeed() {
		System.out.println("bull runSpeed is :"+runSpeed);
	}
	public void bullHornShape() {
		System.out.println("bull hornShape is :"+hornShape);
	}

}

