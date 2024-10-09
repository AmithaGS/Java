   // final variable

package Inheritance;

public class Gravity {

	public static void main(String[] args) {
		Science s = new Science();
		System.out.println("Gravity: " + s.gravity);
		// s.gravity = 5.9;                                  //this is reassign the value it gives error 
		System.out.println("Gravity: " + s.gravity);
	}

}

class Science {
	final double gravity = 9.8;         // using final keyword it can't reassign the value 
}

