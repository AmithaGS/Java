package Inheritance;

public class Mentor {
	public static void main(String[] args) {
		System.out.println("Java mentor---------------");
		JavaMentor jm = new JavaMentor();
		jm.startClass();
		jm.teach();
		jm.endClass();
		
		System.out.println("Sql mentor---------------");
		SqlMentor sm = new SqlMentor();
		sm.startClass();
		sm.teach();
		sm.endClass();
	}
}

class Sql {
	void startClass() {
		System.out.println("Starting the class");
	}
	void teach() {
		System.out.println("Steacher teach the class");
	}
	void endClass() {
		System.out.println("ending the class");
	}
}

class JavaMentor extends Sql {
	
}
 
class SqlMentor extends Sql {
	
}