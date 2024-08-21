package com.xworkz.Array;
import com.xworkz.Array.Bike.River;

public class RiverRunner {

	public static void main(String[] args) {
		River river1=new River();
		river1.storeRiverNames("Tunga bhadra river");
		river1.storeRiverNames("Ganga river");
		river1.storeRiverNames("Yamuna river");
		river1.storeRiverNames("Indus river");
		river1.storeRiverNames("Narmada river");
		river1.storeRiverNames("Krishna river");
		river1.storeRiverNames("Godavari river");
		river1.printRiverDetails();
	}

}
