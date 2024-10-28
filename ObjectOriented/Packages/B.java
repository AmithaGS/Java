package Package1;

public class B {

	void access() {
		A obj = new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		// System.out.println(obj.d);      // private is access in the same class only
	}
}
