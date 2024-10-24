package Constructor;

public class DemoRunner {

	public static void main(String[] args) {
		new Demo();
		
	}
}

class Demo {
	Demo() {
		this(10);
		System.out.println("0 parameter constructor");
	}
	Demo(int x) {
		this(10,20);
		System.out.println("1 parameter constructor");
	}
	Demo(int x, int y) {
		this(10,20,30);
		System.out.println("2 parameter constructor");
	}
	Demo(int x, int y, int z) {
		System.out.println("3 parameter constructor");
	}
}