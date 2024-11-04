package LambdaExpressions;

public class Greeting {

	public static void main(String[] args) {
		Greet g = () ->  System.out.println("Hello world");
		g.hello();
	}
}

interface Greet {
	public abstract void hello();
}