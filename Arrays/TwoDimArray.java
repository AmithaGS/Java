package DataStructures.Arrays;
import java.util.*;

public class TwoDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = sc.nextInt();
		System.out.println("Enter the number of columns");
		int c = sc.nextInt();
		 int[][] marks = new int[r][c];
			System.out.println("Enter the array elements");
			// populating the array
		 for (int i = 0; i < marks.length; i++) {
			 for (int j = 0; j < marks[i].length; j++) {
				 marks[i][j] = sc.nextInt();
			 }
		 } 
		 // display array elements
			 for (int i = 0; i < marks.length; i++) {
				 for (int j = 0; j < marks[i].length; j++) {
					 System.out.println(marks[i][j] + " ");				
				 }
			 System.out.println();
		 }
	}
}
