package com.xworkz.engineering;

public class Snake {
	private String name;
	private double length;
	private String type;
	
	public Snake(String name,double length,String type) {
		this.name=name;
		this.length=length;
		this.type=type;
		System.out.println("snake is created with String,double and String");
	}
	
	public void print() {
		System.out.println("snake name is :"+this.name);
		System.out.println("snake length is :"+this.length);
		System.out.println("snake type is :"+this.type);

	}
	

}
