package com.xworkz.Array.Bike;

public class BikeStore {

	private String[] bikes = new String[7];
	private int index = 0;

	public void bikeStore(String bike) {
		bikes[index] = bike;
		index++;
	}
	
	public void printBikeDetails() {
		System.out.println("bike store is printed");
		for (String bike : bikes) {
			System.out.println("bike name is :" + bike);
		}
	}
	
}