package BootCampArrays;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int target, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Target element in an array: ");
		int target = sc.nextInt();
		int result = linearSearch(target, arr);
		
		System.out.println("Number found on: "+ result);
	}
}
