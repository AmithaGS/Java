package DataStructures.ArraysFrameworks;

import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {

		ArrayDeque dq = new ArrayDeque();
		dq.add(100);
		dq.add(2.002);
		dq.add("three");
		dq.add(false);
		
		System.out.println(dq);
		dq.addLast(100);
		dq.addFirst(500);
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
	}
}
