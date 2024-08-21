package com.xworkz.Array;

import com.xworkz.Array.Bike.BikeStore;

public class BikeRunner {

	public static void main(String[] args) {
		BikeStore bikestore1 = new BikeStore();
		
		bikestore1.bikeStore("KTM");
		bikestore1.bikeStore("honda");
		bikestore1.bikeStore("pulser");
		bikestore1.bikeStore("activa");
		bikestore1.bikeStore("suzuki");
		bikestore1.bikeStore("royal enfield");
		bikestore1.bikeStore("rx 100");
		bikestore1.printBikeDetails();
	

	}

}
