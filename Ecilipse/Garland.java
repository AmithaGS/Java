package com.xworkz.engineering;

public class Garland {
	private String type;
	private double cost;
	private int quantity;
	
	Garland(String type,double cost,int quantity){
		this.type=type;
		this.cost=cost;
		this.quantity=quantity;
	}
	public void displayGarland() {
		System.out.println("garland type is :"+this.type);
		System.out.println("garland cost is :"+this.cost);
		System.out.println("garland quantity is :"+this.quantity);

	}
}
