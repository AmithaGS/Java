package Abstraction;

public class DemoRunner {

	public static void main(String[] args) {

	}
}

interface DemoInterface {
	// static variable
	static int a = 10;
	
	// static block    - not allowed
	// static {
	// 	System.out.println("demo interface is ongoing");
	// }
	
	// static method
	public static void fun1() {
		System.out.println("fun1 demo classes");
	}
	
	// non static variable
	int b = 20;
	
	//non static method    -- not allowed
	// public void fun() {   
	// 	System.out.println("demo function");
	// }
	
	// abstract method
	abstract void fun2();
	
	// default method
	default void fun3() {
		System.out.println("fun");
	}
}

abstract class Demo {
	// static variable
		static int c = 10;
		
		// static block    -allowed
		static {
			System.out.println("demo interface is ongoing");
		}
		
		// static method   - allowed
		public static void fun4() {
			System.out.println("play demo classes");
		}
		
		// non static variable  -- allowed
		int d = 20;
		
		//non static method    -- allowed
		public void fun5() {   
			System.out.println("demo function");
		}
		
		// abstract method   -- allowed
		abstract void fun6();
		
		// default method   -- not allowed
		
		// default void fun7() {
		//	System.out.println("fun");
		// }
}