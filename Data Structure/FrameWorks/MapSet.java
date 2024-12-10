/*
  types of Map: 1.Hash map : sorting the key values pairs, each key is unique and its not maintain the order
  
                2.LinkedHash map: its maintain the order of insertion
                
                3. Tree map : its maintain the order based on key, if keys are not repeated but values are repeated
                if duplicate entries are present what the latest key is inserted that key is printed
 */

package DataStructures.ArraysFrameworks;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapSet {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "Aman");
		map.put(505, "Rajath");
		map.put(202, "Sam");
		map.put(404, "Raj");
		map.put(101, "Bittu");   // latest key is printed
		
		System.out.println(map);
		System.out.println(map.get(505));
		System.out.println(map.remove(101));
		
// Map views
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());


		System.out.println();
		
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(101, "Aman");
		map1.put(505, "Rajath");
		map1.put(202, "Sam");
		map1.put(404, "Raj");
		map1.put(101, "Bittu");   // latest key is printed

		System.out.println(map1);
		System.out.println();

		TreeMap<Integer, String> map3 = new TreeMap<>();
		map3.put(101, "Aman");
		map3.put(505, "Rajath");
		map3.put(202, "Sam");
		map3.put(404, "Raj");
		map3.put(101, "Bittu");   // latest key is printed

		System.out.println(map1);
	}
}
