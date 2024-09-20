package practice.com;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 371;
		int num = number;
		int length =String.valueOf(number).length();
		int digit = 0, sum = 0;
		
		while (num > 0){
			digit = num % 10;
			num = num / 10;
			sum += Math.pow(digit, length);
		}
			if (sum == number) {
				System.out.println("armstrong");
			} else {
				System.out.println("Not a armstrong");
			}
	
	}
}
