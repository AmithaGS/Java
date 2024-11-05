package DataStructures.Arrays;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creation
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int age[] = new int[size];
		
		// populating the array elements
		System.out.println("please enter the elements to array: ");
		for (int i = 0; i < age.length; i++) {
			age[i] = sc.nextInt();
		}
		
		// accessing the elements
		System.out.println("elements are: ");
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
	}

}
