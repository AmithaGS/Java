package Polymorphism;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();     //Upcasting
		// overridden
		vehicle.start();
		//inherited
		vehicle.stop();
		  // vehicle.openTrunk();    // it gives a error becoz its a child specific
			((Car)(vehicle)).openTrunk();       // downCasting        
	}
}

class Vehicle {
	public void start() {
		System.out.println("Vehicle starts");
	}
	public void stop() {
		System.out.println("Vehicle stops");
	}
}

class Car extends Vehicle {
	public void start() {
		System.out.println("car starts with a key");
	}
	public void stop() {
		System.out.println("Car stops");
	}
	public void openTrunk() {
		System.out.println("Car has opening the trunk");
	}
}