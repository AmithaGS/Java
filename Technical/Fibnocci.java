package practice.com;

public class Fibnocci {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;
		int count = 10;
		System.out.println("n1 value: "+n1);
		System.out.println("n2 value: "+n2);
		
		for (int i = 2; i < count; i++) {
			n3= n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" "+n3);
		}
		
	}

}
