package practice.com;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num == 0) {
			System.out.println(num +" is zero");
		} else if (num > 0) {
			System.out.println(num +" is a positve number");
		} else {
			System.out.println(num + " is a negative number");
		}	
	}
}
