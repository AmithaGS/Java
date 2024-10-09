package Inheritance;

public class Parent {
	public static void main(String[] args) {
		ParentRunner p = new ParentRunner();
		p.fun();
		
		Child c = new Child();
		c.fun();
		
		ParentRunner pp = new Child();         //up-casting    when we use pp ref parent fun is display
		                                                      // when use c ref child fun is display
		pp.fun();
	}
}

class ParentRunner {
	public static void fun() {
		System.out.println("Parent fun");
	}
}

class Child extends ParentRunner {
	public static void fun() {
		System.out.println("Child fun");
	}
}