package DataStructures.Arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {10, 5, 30, 40, 100, 50};
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println("Sorted Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
