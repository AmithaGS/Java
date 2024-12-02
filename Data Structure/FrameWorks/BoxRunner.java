package DataStructures.ArraysFrameworks;

public class BoxRunner {

	public static void main(String[] args) {
		Box<String> box = new Box<String>("Deep");
		System.out.println(box.getContainer());
	}
}

class Box<T> {
	T container;
	
	public Box(T container) {
		this.container = container;
	}
	public T getContainer() {
		return container;
	}
}