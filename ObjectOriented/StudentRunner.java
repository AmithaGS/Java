package ObjectOriented;

public class StudentRunner {

	public static void main(String[] args) {
		Student s = new Student();
		s.roll=7;
		s.name ="Amitha";
		s.branch ="CSE";
		s.cgpa =8.6;
		s.yearOfPassOut=2024;
	
		s.prepare();
		s.giveIntro();
		s.interviews();
	}

}
