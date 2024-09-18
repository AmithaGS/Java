//using char dataType

package kodnestPatterns;

public class Pattern4UsingChar {

	public static void main(String[] args) {
		for (int i = 'A'; i <= 'D'; i++) {
			for (int j = 'A'; j <= 'D'; j++) {
				System.out.print((char)i);       //only line numbers will print
			}
			System.out.println();
		}
	}

}
