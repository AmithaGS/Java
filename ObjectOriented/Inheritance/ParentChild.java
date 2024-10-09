   // final method

package Inheritance;

public class ParentChild {

	public static void main(String[] args) {
		Children c = new Children();
		c.fun();
	}
}

class ParentRun {
	final void fun() {                       // this method as final keyword
		System.out.println("Parent is fun");
	}
}

class Children extends ParentRun {
	//void fun() {                       // it gives error and it can't be override the parent class
	// 	System.out.println("Child is fun");
	// }
}
