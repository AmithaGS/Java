package Abstraction;

class CalciRunner {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}
 
//impure abstract method
abstract class Calsi1 {
	public abstract void add();      // abstract method
	public void sub() {              // concrete method
		int a = 10, b = 5;
		System.out.println("Sub: "+ (a-b));
	}
}

// pure abstart method
abstract class Calsi2 extends Calsi1 {
	abstract void mul();
	abstract void div();
}

class Calculator extends Calsi2 {
	public void mul() {
		int a = 20, b = 10;
		System.out.println("Mul: "+ (a*b));
	}
	
	public void div() {
		int a = 20, b = 10;
		System.out.println("Div: "+ (a/b));
	}
	
	public void add() {
		int a = 20, b = 10;
		System.out.println("Add: "+ (a+b));
	}
}