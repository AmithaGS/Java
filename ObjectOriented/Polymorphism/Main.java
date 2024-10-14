package Polymorphism;

public class Main {

	public static void main(String[] args) {
		Mentor m;
		m = new JavaMentor();    // UpCasting
		m.teach();
		m.groom();	
		
		m= new PythonMentor();
		m.teach();
		m.groom();
		
		m= new DBMentor();
		m.teach();
		m.groom();

	}

}

class Mentor {
	public void teach() {
		System.out.println("mentor teaches!!!");
	}
	public void groom() {
		System.out.println("grooming for students");
	}
}

class JavaMentor extends Mentor {
	public void teach() {
		System.out.println("mentor teaches Java!!!");
	}
	public void groom() {
		System.out.println("grooming for students");
	}
}

class PythonMentor extends Mentor {
	public void teach() {
		System.out.println("mentor teaches Python!!!");
	}
	public void groom() {
		System.out.println("grooming for students");
	}
}

class DBMentor extends Mentor {
	public void teach() {
		System.out.println("mentor teaches DB!!!");
	}
	public void groom() {
		System.out.println("grooming for students");
	}
}
