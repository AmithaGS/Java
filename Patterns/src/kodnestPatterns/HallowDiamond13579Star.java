package kodnestPatterns;

public class HallowDiamond13579Star {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (5-i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i)-1; k++) {
				if (k ==1 || k == ((2*i)-1)) {
					System.out.print("*");
			    }
					else {
						System.out.print(" ");
					}
		     	}
				System.out.println();
			}
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= (5-i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i)-1; k++) {
				if (k ==1 || k == ((2*i)-1)) {      // this is for hallow spaces
					System.out.print("*");
			    }
					else {
						System.out.print(" ");
					}
		     	}
			System.out.println();
		}
	}
}
