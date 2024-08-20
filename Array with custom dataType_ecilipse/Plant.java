package com.xworkz.custom_dataType;

public class Plant {
	private String name;
	private double height;
	private String type;
	private boolean isgivingFlowers;
	private String category;

	private double growthRate = 120.0;
	private String color = "greenish";
	private String kingdom = "Plantae";
	private String phylum = "Tracheophyta";
	private boolean iswaterPlant = true;

	public Plant(String name, double height, String type, boolean isgivingFlowers, String category) {
		this.name = name;
		this.height = height;
		this.type = type;
		this.isgivingFlowers = isgivingFlowers;
		this.category = category;
	}

	public void printPlant() {
		System.out.println("plant name is :" + this.name);
		System.out.println("plant height is :" + this.height);
		System.out.println("plant type is :" + this.type);
		System.out.println("plant is giving flowers :" + this.isgivingFlowers);
		System.out.println("plant category is :" + this.category);
		System.out.println("plant growthRate is :" + growthRate);
		System.out.println("plant color is :" + color);
		System.out.println("plant kingdom is :" + kingdom);
		System.out.println("plant phylum is :" + phylum);
		System.out.println("plant iswaterPlant :" + iswaterPlant);

	}
}
