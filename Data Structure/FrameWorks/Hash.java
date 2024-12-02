/*
 1.Hash table is storing the data
 how its work:   hashSet, LinkedHashSet, Maps etc
 */


/* n % 10 is used when we do modulus that number is stored in that index
 ex: 55 % 10 = 5 ---> 55 is stored in 5th index */
 

package DataStructures.ArraysFrameworks;

import java.util.LinkedHashSet;
import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
/* whenever hashSet is used on that time it does not allow the duplicate values and 
		does not maintain the order of insertion
*/
		
		HashSet<Integer> hs1 = new HashSet<>();    
		hs1.add(44);
		hs1.add(11);
		hs1.add(55);
		hs1.add(33);
		hs1.add(22);
		hs1.add(22);
		System.out.println(hs1);
		
/* whenever LinkedHashSet is used on that time it does not allow the duplicate values and if we want to 
		maintain the order of insertion, how the user given the values in the same order it will print
*/
	
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(44);
		hs.add(11);
		hs.add(55);
		hs.add(33);
		hs.add(22);
		hs.add(22);
		System.out.println(hs);

		}
}
	