package Abstraction;

public class CalculatorRunner {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		accessCalculator(calc);
	}
	public static void accessCalculator(MyCalculator calc) {
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}

interface Calculatorr {
	abstract void add();
	abstract void sub();
	abstract void mul();
	abstract void div();
}

class MyCalculator implements Calculatorr {
	public void add() {
		System.out.println("Add: "+(5+2));
	}
	public void sub() {
		System.out.println("Sub: "+(5-2));
	}
	public void mul() {
		System.out.println("Multiply: "+(5*2));
	}
	public void div() {
		System.out.println("Div: "+(6/2));
	}
}