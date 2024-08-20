package com.xworkz.engineering;

public class SnakeRunner {
//control+shift+f   =format
	public static void main(String[] args) {
		Snake snake1 = new Snake("nagarahavu", 80.0, "alive");
		Snake snake2 = new Snake("anaconda", 100.0, "alive");
		Snake snake3 = new Snake("cobra", 70.0, "dead");

		Snake[] snakes = new Snake[3];
		snakes[0] = snake1;
		snakes[1] = snake2;
		snakes[2] = snake3;

		for (Snake ref : snakes) { // for each
			System.out.println(ref);
			ref.print();
		}
	}

}
