package Package2;

import Package1.A;

public class D {

	void access() {
		A obj = new A();
		System.out.println(obj.a);
		// System.out.println(obj.b);     -- its protected its not access the other package
		// System.out.println(obj.c);
		// System.out.println(obj.d);
	}
}
