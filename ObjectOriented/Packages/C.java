package Package2;

import Package1.A;

public class C extends A {
	
	void access() {
		System.out.println(a);  
		System.out.println(b);         //child class can access the protected when it is in different package
		// System.out.println(c);      -- its a default it access in the same package
		// System.out.println(d);      -- its a private only access with in the same class 
	}
}
