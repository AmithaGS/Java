package AdvanceJava;

public class StackFlow {

	public static void main(String[] args) {
		StackFlow.greet();      // only one hello is printed
		
	}
	
	public static void greet() {
			System.out.println("Hello");
			greet();         // this method is called it gives stackOverFlow
		}
}
