package OuterInner;

public class AddRunner {

	public static void main(String[] args) {
		Add a = new Add() {
			public void add(int a, int b) {
				System.out.println("Sum: " + (a+b));
			}
		};
		a.add(50, 20);
	}
}

// functional interface
interface Add {
	public abstract void add(int a, int b);
}