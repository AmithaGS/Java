package practice.com;

import java.util.Scanner;

public class Fibanocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1;
		
		for (int i = 1; i <= n; i++) {
			System.out.print(a +" ");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}
