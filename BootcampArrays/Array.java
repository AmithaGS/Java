package BootCampArrays;

public class Array {

	public static void main(String[] args) {
		int a[] = {5, 7, 10, 15, 20, 55, 80};
		System.out.println("Even elements are: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			} 
		}
		System.out.println("Odd elements are: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			} 
		}
	}
}
