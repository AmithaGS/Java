package kodnestPatterns;

public class rightAngledTriangleUsingNumbers {

	public static void main(String[] args) {
		int x = 10;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x)	;
				x++;
				if (j < i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
