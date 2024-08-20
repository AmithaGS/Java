package com.xworkz.engineering;

public class GaintWheel {
    private	int noOfPeoples;
    private double price;
    private boolean isSafe;
    
    GaintWheel(int noOfPeoples,double price,boolean isSafe){
    	this.noOfPeoples=noOfPeoples;
    	this.price=price;
    	this.isSafe=isSafe;
    }
    
    public void displayGaintWheel() {
    	System.out.println("no of peoples in gaint wheel is :"+this.noOfPeoples);
    	System.out.println("price of gaint wheel is :"+this.price);
    	System.out.println("gaint wheel is safe :"+this.isSafe);

    }
}
