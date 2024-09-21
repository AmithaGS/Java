/*
 *    ******
 *    
 *    ******
 *    
 *    ******
 *    
 *    ******
 */

package kodnestPatterns;

public class AlternatingStarsAndSpaces {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
