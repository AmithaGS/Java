package practice.com;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month) {
		case 1: 
			System.out.println("Winter");
			break;
		case 2:
			System.out.println("Winter");
			break;
		case 3:
			System.out.println("Spring");
			break;
		case 4:
			System.out.println("Spring");
			break;
		case 5:
			System.out.println("Spring");
			break;
		case 6:
			System.out.println("Summer");
			break;
		case 7:
			System.out.println("Summer");
			break;
		case 8:
			System.out.println("Summer");
			break;
		case 9:
			System.out.println("Fall");
			break;
		case 10:
			System.out.println("Fall");
			break;
		case 11:
			System.out.println("Fall");
			break;
		case 12:
			System.out.println("Winter");
			break;
		default :
			System.out.println("Invalid month");
		}

	}

}
