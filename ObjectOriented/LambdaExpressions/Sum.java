package LambdaExpressions;

public class Sum {
	public static void main(String[] args) {
		Summ s = (a, b) -> a + b;
		System.out.println("Sum: " + s.add(10,20));
	}
}

interface Summ {
	public abstract int add(int a, int b);
}
