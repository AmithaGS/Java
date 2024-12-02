    // Using for each loop

package DataStructures.Arrays;

public class TraverseString {

	public static void main(String[] args) {
		String arr[] = {"a", "bb", "ccc", "dddd", "eeeee"};
		
		for (String alphabet : arr) {         // alphabet is reference  
			System.out.println(alphabet);
		}
	}
}
