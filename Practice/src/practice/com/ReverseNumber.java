package practice.com;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234;
		System.out.println("given number is: "+num);
		int rev = 0, rem;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("reversed number is: "+rev);
	}

}
