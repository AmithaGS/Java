package Constructor;

public class UsingSuperMethod {

	public static void main(String[] args) {
		new Child();
	}
}

class Parent {
	Parent() {
		// super();       // implicitly call the super method
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	Child() {
		// super();
		System.out.println("Child constructor");
	}
}