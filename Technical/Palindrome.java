package practice.com;

public class Palindrome {

	public static void main(String[] args) {
		int num = 12021;
		System.out.println(num + "  the given number");
		int rev = 0, rem, temp;
		temp = num;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev) {
		System.out.println(num +"  it is a palindrome number");
	    } else {
		    System.out.println(num + "  it is not a palindrome number");
	       }
    }
}
