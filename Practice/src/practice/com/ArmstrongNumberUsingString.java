package practice.com;

import java.util.Scanner;

public class ArmstrongNumberUsingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int copyofN = n;
		String s = "" +n;    //"123"   first create a empty string after integer number is stored
		int power = s.length();
		while (n > 0) {
			int digit = n % 10;   //extract last digit
			sum = sum + (int) Math.pow(digit,power);
			n = n / 10;    // remove last digit   and after n = 0 so we initialize variable to store the number
		}
		
		if (copyofN == sum)
			System.out.println(copyofN + " is an armstrong number");
		else 
			System.out.println(copyofN + " is not an armstrong number");
	}
}
