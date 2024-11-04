package OuterInner;

public class SumRunner {

	public static void main(String[] args) {
		Sum s = new Sum() {
			public void add() {
				int a = 10;
				int b = 20;
				System.out.println("Sum: " + (a+b));
			}
		};
		s.add();
	}
}

// functional interface
interface Sum {
	public abstract void add();
}