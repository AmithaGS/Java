package Abstraction;

public class RobotRunner {

	public static void main(String[] args) {
		FighterRobot fr = new FighterRobot();
		accessRobot(fr);
		// or
		accessRobot(new TeacherRobot());
		accessRobot(new FighterRobot());
	}
	public static void accessRobot(Robot r) {
		r.learn();
		r.charge();
		r.walk();
	}
}

class Robot {
	void learn() {
		System.out.println("Robot is learning");
	}
	void charge() {
		System.out.println("Robot is charging");
	}
	void walk() {
		System.out.println("Robot is walking");
	}
}

class FighterRobot extends Robot {
	void fight() {
		System.out.println("Fighter robot is fighting");
	}
}

class TeacherRobot extends Robot {
	void teach() {
		System.out.println("teacher robot is teaching");
	}
}

class DriverRobot extends Robot {
	void drive() {
		System.out.println("driver robot is driving");
	}
}