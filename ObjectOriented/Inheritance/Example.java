package Inheritance;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age :");
		int age = sc.nextInt();     
		// when we use nextInt after string is present on that time again use sc.nextLine()
		sc.nextLine();
		System.out.println("Enter Name :");
		String s1 = sc.nextLine();
		
		System.out.println("Age input: " +age);
		System.out.println("name input: " +s1);
	}

}
