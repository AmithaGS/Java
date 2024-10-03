package Inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st string:");
		String s1 = sc.next();

		System.out.println("Enter 2nd string:");
		String s2 = sc.nextLine();
		
		System.out.println("next() input: " +s1);
		System.out.println("nextLine() input: " +s2);
	}

}
