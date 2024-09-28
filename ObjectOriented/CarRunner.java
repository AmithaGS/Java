package ObjectOriented;

public class CarRunner {

	public static void main(String[] args) {
		Car car = new Car();
		car.color="Black";
		car.brand = "Toyato";
		car.price= 1200000;
		System.out.println("Color :"+car.color);
		System.out.println("Brand :"+car.brand);
		System.out.println("Price :"+car.price);
		car.accelerate();
		car.goToLongDrive();
	}

}
