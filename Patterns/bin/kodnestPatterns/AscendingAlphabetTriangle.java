/*
 *     A
 *     AA
 *     AAA
 *     AAAA
 *     AAAAA
 */

package kodnestPatterns;

public class AscendingAlphabetTriangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('A');
			}
			System.out.println();
		}
	}
}
