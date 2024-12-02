package DataStructures.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		// array creation
		int age[] = new int[5];
		
		// populating the array
		age[0] = 11;
		age[1] = 22;
		age[2] = 33;
		age[3] = 44;
		age[4] = 55;

		// accessing the element
		for(int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
	}
}
