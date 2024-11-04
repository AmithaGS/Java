package BootCampArrays;

import java.util.Scanner;

public class MultiplicationOfIndexes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		System.out.println("Array elements are: ");
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the first index");
		int x = sc.nextInt();
		
		System.out.println("Enter the second index");
		int y = sc.nextInt();
		
		int result = arr[x] * arr[y];
		System.out.println("Result: " + result);
	}
}
