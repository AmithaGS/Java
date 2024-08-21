package com.xworkz.Array.Bike;

public class Dams {
	private String[] dams=new String[7];
	private int index=0;
	
	public void damStore(String damName) {
		dams[index]=damName;
		index++;
	}
	public void printDamDetails() {
		System.out.println("dam is created ");
		for(String dam :dams) {
			System.out.println("dam names are :"+dam);
		}
			
	}
}
