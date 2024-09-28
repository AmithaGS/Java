package ObjectOriented;

public class Student {    
	     //states
	int roll;
	String name;
	String branch;
	double cgpa;
	int yearOfPassOut;
	
	//behaviour
	void prepare() {
		System.out.println("Student preparing for exams");
	}
	void giveIntro() {
		System.out.println("Student gives the introduction");
		System.out.println("Roll :"+roll);
		System.out.println("Name :"+name);
		System.out.println("Branch :"+branch);
		System.out.println("CGPA :"+cgpa);
		System.out.println("YearOfPassOut :"+yearOfPassOut);
	}
	void interviews() {
		System.out.println("Student gives the interviews");
	}
}
