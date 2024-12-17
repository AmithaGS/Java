package DataStructures.ArraysFrameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// fetching the list
		System.out.println(list);
		
		// fetching using for loop
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		// fetching using for enhanced for loop
		for (Object element : list)
			System.out.println(element);
		System.out.println();
		
		// fetching using iterators
		Iterator itr = list.iterator();
		while (itr.hasNext()) {     // hasNext() is used to check whether next element is present or not
			System.out.println(itr.next());    // itr.next() is moving forward to next element
		}
		

	}
}
