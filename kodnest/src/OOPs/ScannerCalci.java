package OOPs;

import java.util.Scanner;

public class ScannerCalci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter ur choice:");
		System.out.println("1.sum 2.difference 3.multiply 4.division");
		int operation=sc.nextInt();
		System.out.println("please enter 1st number:");
		int n1= sc.nextInt();
		System.out.println("please enter 2nd number:");
		int n2= sc.nextInt();
		if(operation==1) {
			Calculat.sum(n1,n2);
		}
		else if(operation==2) {
			Calculat.difference(n1,n2);
		}
		else if(operation==3) {
			Calculat.multiply(n1, n2);
		}
		else if (operation==4) {
			Calculat.divide(n1,n2);
		}
		else {
			System.out.println("Invalid input!!!!!");
		}
	}

}

class Calculat{
	public static void sum(int a,int b) {
		int res=a+b;
		System.out.println("Sum is :"+res);
	}
	public static void difference(int a,int b) {
		int res1=a-b;
		System.out.println("difference is :"+res1);
	}
	public static void multiply(int a,int b) {
		int res2=a*b;
		System.out.println("multiply is :"+res2);
	}
	public static void divide(int a,int b) {
		int res3=a/b;
		System.out.println("divide is :"+res3);
	}
}