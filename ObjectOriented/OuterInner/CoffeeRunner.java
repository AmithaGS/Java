      // local classes

package OuterInner;

public class CoffeeRunner {

	public static void main(String[] args) {
		OuterCoffeeShop out = new OuterCoffeeShop();
		out.outerCoffeeShop();
	}
}

class OuterCoffeeShop {
	
	void outerCoffeeShop() {
		System.out.println("outer Coffee shop()");
		
		class InnerCoffeeShop {            // inside method one class declared called local class
			void innerCoffeeShop() {
				System.out.println("inner coffee shop()");
			}
		}
		InnerCoffeeShop in = new InnerCoffeeShop();
		in.innerCoffeeShop();
	}
	
}