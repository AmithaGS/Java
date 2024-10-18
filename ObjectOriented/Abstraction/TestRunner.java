package Abstraction;

public class TestRunner {

	public static void main(String[] args) {
		Test test = new Test();
		test.fun1();
		test.fun2();
	}
}

class Demo1 {
	void fun1() {
		System.out.println("fun1");
	}
}

interface Demo2 {
	abstract void fun2();
}

class Test extends Demo1 implements Demo2 {
	public void fun2() {
		System.out.println("fun2");
	}
}