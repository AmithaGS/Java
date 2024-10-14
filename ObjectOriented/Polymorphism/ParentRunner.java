              //RunTime polymorphism or Method overriding

// why runtime polymorphism:   becoze exact method is called in main method 

package Polymorphism;

public class ParentRunner {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.fun();
	}
}

class Parent {
	void fun() {
		System.out.println("Parent fun"); // Dynamic method dispatch, dynamic binding, method overriding, runtime
	}
}

class Child extends Parent {
	void fun() {
		System.out.println("Child fun");
	}
}
