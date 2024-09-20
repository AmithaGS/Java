package practice.com;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 23;
		checkPrime(n);
	}

	 private static void checkPrime(int n) {
		int count = 0;
		if (n < 2) {     //negative num & 0 and 1 are not prime
			System.out.println("the given number is" + n + "is not a prime number");
			System.exit(0);
		}
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) 
				count+=1;
		}

			if(count > 2) {    // 23 have 1 and 23 are two divisors so count is 2 if (2 > 2) false so it is a prime
				System.out.println("the number is" + n + " is not a prime");
			}
			else
				System.out.println("the number is " + n + " is a prime");
		
	    }
 }
