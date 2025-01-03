//combine normal pyramid with inverted pyramid

package kodnestPatterns;

public class DiamondPyramid {

	public static void main(String[] args) {
		//normal pyramid
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (5-i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				if (k < i) {        //this condition is for spaces
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//inverted pyramid
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (i-1); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (6-i); k++) {
				System.out.print("*");
				if (k < (6-i)) {               //this condition is for spaces
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
