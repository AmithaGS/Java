package AdvanceJava;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		try {
			System.out.println("CONNECTION ESTABLISHED");
			System.out.println("Enter 2 numbers: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Division result is: " + c);
			
			System.out.println("Enter array length:");
			size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Array of size " + size + " got created");
			System.out.println("Enter element and position(index) to store the entered element");
			int element = sc.nextInt();
			int pos = sc.nextInt();
			
			arr[pos] = element;
			System.out.println("Element in the position " + pos + " is " + arr[pos]);
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException: / by ZERO at line 15");
		}
		catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException: give positive array size at line 20");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException:  enter elements 0 to 9 at line 26");
		}
		catch (Exception e) {
			System.out.println("Give some other..");
		}
		System.out.println("CONNECTION TERMINATED");
	}

}
