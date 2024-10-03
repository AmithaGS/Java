package ObjectOriented;

public class Students {

	public static void main(String[] args) {
		Children c1 = new Children();
		Children c2 = new Children();
		c1.name = "Amitha";
		accessStudents(c1);
		c2.name = "viraj";
		accessStudents(c2);

	}
	public static void accessStudents(Children ch) {
		ch.learn(); 
		ch.giveInterviews();
	}

}

class Children {
	String name;
	void learn() {
		System.out.println(name +" learn tech");
	}
	void giveInterviews() {
		System.out.println(name +" give interviews");
	}
}
