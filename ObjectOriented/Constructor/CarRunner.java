    // COPY CONSTRUCTOR

package Constructor;

public class CarRunner {

	public static void main(String[] args) {
		CAr c1 = new CAr("Maruti", "Black", 1350000);
		c1.display();
		CAr c2 = new CAr(c1);           // copy constructor
		c2.color = "White";
		c2.display();
		
	}
}

class CAr {
	String brand;
	String color;
	int price;
	
	public CAr(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}
	
	public CAr(CAr c) {            // for copy constructor Object name is passed with in paranthesis
		this.brand = c.brand;
		this.color = c.color;
		this.price = c.price;
	}
}