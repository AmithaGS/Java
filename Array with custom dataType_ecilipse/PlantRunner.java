package com.xworkz.custom_dataType;

public class PlantRunner {

	public static void main(String[] args) {
		Plant plant1 = new Plant("Rose", 50, "shrub", true, "floura");
		Plant plant2 = new Plant("lilly", 200, "small plant", true, "floura");
		Plant plant3 = new Plant("dairy", 150, "tree", true, "floura");

		Plant[] plants = { plant1, plant2, plant3 };

		for (Plant plant : plants) {
			plant.printPlant();
			System.out.println();
		}
	}

}
