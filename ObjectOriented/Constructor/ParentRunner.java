package Constructor;

public class ParentRunner {

	public static void main(String[] args) {
		new Childd();
	}
}

class Parentt {
	Parentt() {
		this("hello");
		System.out.println("Parent constructor");
	}
	Parentt(String s) {
		System.out.println("Parent string constructor");
	}
}

class Childd extends Parentt {
	Childd() {
		this(10,50);
		System.out.println("Child 0 constructor");
	}

	 Childd(int i, int j) {
			System.out.println("Child 2 constructor");
	 }
}