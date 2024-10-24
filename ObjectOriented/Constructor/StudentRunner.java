package Constructor;

public class StudentRunner {

	public static void main(String[] args) {
		Student s1 = new Student(101,"Amitha",2024,"CSE",8.6f);
		s1.introduce();
		
		Student s2 = new Student(102,"Kishan",2022,"ISE",8.9f);
		s2.introduce();
	}
}

class Student {
	int roll;
	String name;
	int yop;
	String stream;
	float cgpa;
	
	Student(int r,String n,int y,String s,float c) {
		roll= r;
		name= n;
		yop= y;
		stream= s;
		cgpa= c;
	}
	
	void introduce() {
		System.out.println("Student introduce");
		System.out.println("Roll: " +roll);
		System.out.println("Name: " +name);
		System.out.println("yop: " +yop);
		System.out.println("Stream: " +stream);
		System.out.println("cgpa: " +cgpa);

		

	}
}