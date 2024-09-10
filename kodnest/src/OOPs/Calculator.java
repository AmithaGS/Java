package OOPs;

public class Calculator {

	public static void main(String[] args) {
		Calci.sum(20,10);
		Calci.difference(50,10);
		Calci.multiply(10, 60);
		Calci.divide(100,25);
	}
}

class Calci{
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
