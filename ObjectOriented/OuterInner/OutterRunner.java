package OuterInner;

public class OutterRunner {

	public static void main(String[] args) {
		Outter outt = new Outter();
		outt.outter();
		
	}
}

class Outter {
	private int x = 200;
	private static int y = 99;
	
	static class Innner {
		void innerr() {
			System.out.println("inner fun()");
			Outter outt = new Outter();
			System.out.println("Outer x: " + outt.x);     

			// System.out.println("Outer x: " + x);        ---> error not a static
			System.out.println("Outer y: " + y);
		}
	}
	
	void outter() {
		System.out.println("Outter fun()");
		Innner inn = new Innner();
		inn.innerr();
	}
}