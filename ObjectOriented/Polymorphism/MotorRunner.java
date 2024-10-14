package Polymorphism;

public class MotorRunner {

	public static void main(String[] args) {
		accessMotor(new Caar());
		accessMotor(new Bike());
	}
	
	public static void accessMotor(Motor m) {
		m.travel();
		if (m instanceof Caar) {
			((Caar)m).useSafetyBelts();
		} else if (m instanceof Bike) {
			((Bike)m).useHelmets();
		}
	}
}

class Motor {
	public void travel() {
		System.out.println("Travel starts");
	}
}

class Caar extends Motor {
	public void travel() {
		System.out.println("car goes for a long drive");
	}
	public void useSafetyBelts() {
		System.out.println("use Safety Belts");
	}
}

class Bike extends Motor {
	public void travel() {
		System.out.println("bike goes for a long drive");
	}
	public void useHelmets() {
		System.out.println("use helmets");
	}
}