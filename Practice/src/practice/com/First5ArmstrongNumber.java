package practice.com;

import java.util.Scanner;

public class First5ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; ;i++) {
			if (isArmstrong(i)== true) {
				System.out.println(i);
				count++;
			}
			if(count == 5)
				break;
		}
	}
	
	public static boolean isArmstrong(int n) {
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
			return true;
		else 
			return false;
	}
}
