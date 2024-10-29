package OuterInner;

public class OuterRunner {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outerFun();
		
		Outer.Inner in = out.new Inner();
		in.innerFun();
	}
}

class Outer {
	private int val = 200;
	
	class Inner {
		int innerVal = 999;
		void innerFun() {
			System.out.println("fun() of inner class");
			System.out.println("Value of outer class: " + val);
		}
	}
	
	void outerFun() {
		System.out.println("fun() of outer class");
		Inner in = new Inner();
		in.innerFun();
		System.out.println("Value of inner class: " + in.innerVal);
	}
}