/* 55555
 * 44444
 * 33333
 * 22222
 * 11111
 */

package kodnestPatterns;

public class Pattern3 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
