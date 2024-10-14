package Polymorphism;

public class MentorRunner {

	public static void main(String[] args) {
		JavaMentorr jm = new JavaMentorr();
		accessMentor(jm);
		
		PythonMentorr pm = new PythonMentorr();
		accessMentor(pm);
		
		DBMentorr dm = new DBMentorr();
		accessMentor(dm);
	}
	public static void accessMentor(Mentorr m) {
		m.teach();
		m.groom();
	}
}

class Mentorr {
	public void teach() {
		System.out.println("mentor teaches!!!");
	}
	public void groom() {
		System.out.println("grooming for students");
	}
}

class JavaMentorr extends Mentorr {
	public void teach() {
		System.out.println("mentor teaches Java!!!");
	}
	public void groom() {
		System.out.println("grooming for students");
	}
}

class PythonMentorr extends Mentorr {
	public void teach() {
		System.out.println("mentor teaches Python!!!");
	}
	public void groom() {
		System.out.println("grooming for students");
	}
}

class DBMentorr extends Mentorr {
	public void teach() {
		System.out.println("mentor teaches DB!!!");
	}
	public void groom() {
		System.out.println("grooming for students");
	}
}
