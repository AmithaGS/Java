/* TreeSet : values are arranged in ascending order
      multiple values are inserted but in output only single values are presented */

package DataStructures.ArraysFrameworks;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(44);
		set.add(33);
		set.add(33);
		set.add(11);
		set.add(55);
		set.add(33);
		System.out.println(set);
		
		TreeSet<String> set1 = new TreeSet<>();
		set1.add("Amitha");
		set1.add("Ananya");	
		set1.add("Kishor");
		set1.add("Anjali");
		set1.add("Amitha");
		set1.add("Kishan");
		System.out.println(set1);
	}

}
