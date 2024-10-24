package Constructor;

public class UsingThisStu {

	public static void main(String[] args) {
		Stud s1 = new Stud(101,"Amitha");
		s1.introduce();
		Stud s2 = new Stud(102,"Bhoomika");
		s2.introduce();
	}
}

class Stud {
	int roll;
	String name;
	
	Stud(int roll,String name) {
		this.roll= roll;
		this.name= name;
}
	void introduce() {
		System.out.println("Student introduce");
		System.out.println("Roll: " +roll);
		System.out.println("Name: " +name);
	}
}
