package DataStructures.ArraysFrameworks;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList cricketers = new ArrayList();
		cricketers.add("Virat");
		cricketers.add("Dhoni");
		
		System.out.println("Cricketers: " + cricketers);
		
		ArrayList footballers = new ArrayList();
		footballers.add("Ronaldo");
		footballers.add("Messi");
		
		System.out.println("Footballers: " + footballers);
		
		ArrayList players = new ArrayList();
		players.addAll(cricketers);
		players.addAll(footballers);
		
		System.out.println("Players: " + players);
	}
}
