package Polymorphism;

class Teacher {

	public static void main(String[] args) {
		TeacherRunner t1 = new TeacherRunner();
		accessTeacherRunner(new TeacherRunner());
		System.out.println();
		TeacherRunner t2 = new TeacherRunner();
		accessTeacherRunner(t2);

	}
	public static void accessTeacherRunner(TeacherRunner t) {
		t.teachEnglish();
		t.teachPhysics();
		t.teachChemistry();
		t.teachMaths();
		t.teachBiology();
		t.teachProgramming();
	}
}

class TeacherRunner {
	void teachEnglish() {
		System.out.println("teach english");
	}
	void teachPhysics() {
		System.out.println("teach physics");
	}
	void teachChemistry() {
		System.out.println("teach chemistry");
	}
	void teachMaths() {
		System.out.println("teach maths");
	}
	void teachBiology() {
		System.out.println("teach biology");
	}
	void teachProgramming() {
		System.out.println("teach programming");
	}
}