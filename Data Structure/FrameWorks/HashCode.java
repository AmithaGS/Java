package DataStructures.ArraysFrameworks;

public class HashCode {

	public static void main(String[] args) {
		
		Student st1 = new Student(101, "Rahul");
		Student st2 = new Student(101, "Rahul");

		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());

		System.out.println(st1.equals(st2));  // student refers two different addresses so its false
	}
}

class Student {
	int roll;
	String name;
	
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.roll == ((Student)(obj)).roll) {              // downcasting
			if (this.name.equals(((Student)(obj)).name)) {
				return true;
			}
		}
		return false;
	}
	
}