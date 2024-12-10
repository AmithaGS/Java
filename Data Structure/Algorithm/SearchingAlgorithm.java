                                 // Linear search

package Algorithm;

/*
 1.take size of the Array
 2.create array
 3.take elements in array
 4.take number to search
 5.traverse array and check for key at each index
 6.as soon as key is found, print "found" and exit
 7.if key not found upon traversal, print "not found"
 */

public class SearchingAlgorithm {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int key = 90;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not Found");
	}
}