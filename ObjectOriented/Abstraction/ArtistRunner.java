  // interface is used for achieving the multiple inheritance

package Abstraction;

public class ArtistRunner {

	public static void main(String[] args) {
		Artist art = new Artist();
		art.sing();
		art.paint();
	}
}

interface Singer {
	abstract public void sing();
}

interface Painter {
	abstract public void paint();
}

class Artist implements Singer, Painter {
	public void sing() {
		System.out.println("Artist can sing");
	}
	public void paint() {
		System.out.println("Artist can paint");
	}
}