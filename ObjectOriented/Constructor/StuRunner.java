// default values printed

package Constructor;

public class StuRunner {

	public static void main(String[] args) {
		Stu s1 = new Stu(101,"Amitha");
		s1.introduce();
		Stu s2 = new Stu(102,"Bhoomika");
		s2.introduce();
	}
}

class Stu {
	int roll;
	String name;
	
	Stu(int roll,String name) {
		roll= roll;
		name= name;
}
	void introduce() {
		System.out.println("Student introduce");
		System.out.println("Roll: " +roll);
		System.out.println("Name: " +name);
	}
}