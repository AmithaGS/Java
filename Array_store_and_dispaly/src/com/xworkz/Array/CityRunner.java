package com.xworkz.Array;
import com.xworkz.Array.Bike.City;

public class CityRunner {

	public static void main(String[] args) {
		City city1 = new City();
		city1.cityStore("Rajajinagara");
		city1.cityStore("banashankari");
		city1.cityStore("Kengeri");
		city1.cityStore("Pattanagere");
		city1.cityStore("Lalbagh");
		city1.cityStore("Vijayanagara");
		city1.cityStore("magadi road");
		city1.printCityDetails();
	}

}
