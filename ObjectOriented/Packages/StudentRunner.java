package Package1;

public class StudentRunner {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		System.out.println("Access student: " +p.getClass().getSimpleName());
		System.out.println("Access KodnestStudent: " +c.getClass().getSimpleName());
	}
}

class Student {
	
}

class KodnestStudent extends Student {
	
}

class Parent {
	public Student accessStudent() {
		Student st = new Student();
		System.out.println("Access the student");
		return st;
	}
}

class Child extends Parent {
	public KodnestStudent accessStudent() {
		KodnestStudent kst = new KodnestStudent();
		System.out.println("Access the Kodnest student");
		return kst;
	}
}