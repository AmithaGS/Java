  // super : is used to access parent class first 

package Constructor;

public class VehicleRunner {

	public static void main(String[] args) {
		Truck t = new Truck();
		t.display();
	}
}

class Vehiclee {
	int wheels = 4;
	void travel() {
		System.out.println("travel to places by vehicle");
	}
}

class Truck extends Vehiclee {
	int wheels = 8;
	void travel() {
		System.out.println("travel far places by Truck");
	}
	// accessing Truck(child)
	void display() {
		System.out.println("Truck wheels = " + wheels);
		travel();
		
		// accessing Vehicle(parent) using super
		System.out.println("Vehicle wheels = " + super.wheels);
		super.travel();
		
	}
}