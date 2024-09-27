package practice.com;

public class SwapNumbersUsingTemp {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int temp;
		System.out.println("Before swapping");
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		System.out.println("After swapping");
		temp = a;                // temp = 20 
		a = b;                   // a = 10
		b = temp;                // b = 20
		System.out.println("a =" +a);
		System.out.println("b =" +b);
	}
}
