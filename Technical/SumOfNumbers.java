package practice.com;

public class SumOfNumbers {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
			System.out.println("Sum of numbers: " + sum);
		}
	}
}