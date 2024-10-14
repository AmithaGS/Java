                 // overLoading or compileTime polymorphism

package Polymorphism;

public class AdditionRunner {

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(10, 20);
		addition.add(20.0, 30.0);
		addition.add(50, 20.0);
		addition.add(100.0, 30);
		addition.add(20, 30, 40);
		addition.add(10.0, 20.0, 30.0);
	}
}

class Addition {
	public void add(int a, int b) {
		System.out.println("Sum: " +(a+b));
	}
	public void add(double a, double b) {
		System.out.println("Sum: " +(a+b));
	}
	public void add(int a, double b) {
		System.out.println("Sum: " +(a+b));
	}
	public void add(double a, int b) {
		System.out.println("Sum: " +(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Sum: " +(a+b+c));
	}
	public void add(double a, double b, double c) {
		System.out.println("Sum: " +(a+b+c));
	}
}
