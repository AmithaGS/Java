/*
 *  *****
 *  *
 *  *****
 *  *
 *  *****
 */

package practice.com;

public class EPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0)
			System.out.print("*");
		 else {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
		  }
			System.out.println();
	    }
	}
}
