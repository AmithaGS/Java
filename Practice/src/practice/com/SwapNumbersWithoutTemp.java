package practice.com;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		System.out.println("Before swapping");
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		System.out.println("After swapping");
		a = a + b;       // a = 30
		b = a - b;       // b = 30 - 10 = 20
		a = a - b;       // a = 30 - 20 = 10
		System.out.println("a =" +a);
		System.out.println("b =" +b);
	}
}
