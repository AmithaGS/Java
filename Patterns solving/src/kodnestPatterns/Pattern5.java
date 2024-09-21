//using char dataType

package kodnestPatterns;

public class Pattern5 {

	public static void main(String[] args) {
		for (int i = 'A'; i <= 'D'; i++) {
			for (int j = 'A'; j <= 'D'; j++) {
				System.out.print((char)j);       //only line numbers will print
			}
			System.out.println();
		}
	}

}
