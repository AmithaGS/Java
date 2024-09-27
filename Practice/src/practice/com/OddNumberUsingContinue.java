 // print odd numbers using continue keyword to skip over even numbers:

package practice.com;

public class OddNumberUsingContinue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
