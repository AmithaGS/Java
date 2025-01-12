package DataStructures.ArraysFrameworks;

public class StudentRunnerUsinhHashCode {

	public static void main(String[] args) {
		Studentt st1 = new Studentt(101, "Rahul");
		Studentt st2 = new Studentt(101, "Rahul");
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st1.equals(st2));
	}

}
class Studentt {
	int roll;
	String name;
	
	public Studentt(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if (this.roll == ((Studentt)(obj)).roll) {
			if (this.name == ((Studentt)(obj)).name) {
				return true;
			}
		}
		return false;
	}
}