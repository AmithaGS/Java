package ObjectOriented;

public class Laptop {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		accessLaptop(m1);
		accessLaptop(m2);
		
	}
	public static void accessLaptop(Mobile m) {
		m.playMovie();
		m.playGames();
		m.code();
		m.editVideos();
	}
}

class Mobile {
	void playMovie () {
		System.out.println("Laptop can play movies");
	}
	void playGames () {
		System.out.println("Laptop can have some games");
	}
	void code() {
		System.out.println("Laptop may have some code");
	}
	void editVideos() {
		System.out.println("edit the videos on laptop");
	}
}
