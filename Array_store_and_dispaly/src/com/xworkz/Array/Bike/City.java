package com.xworkz.Array.Bike;

public class City {
	private String[] cities = new String[7];
	private int index=0;
	
	public void cityStore(String cityNames) {
		this.cities[this.index]=cityNames;
		this.index++;
	}
	public void printCityDetails() {
		for(String city:cities) {
			System.out.println("city names are :"+city);
		}
	}
}
