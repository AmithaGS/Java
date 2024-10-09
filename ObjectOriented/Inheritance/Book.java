package Inheritance;

class StudyMaterial {
	Chapters chapters = new Chapters();     
}

class Chapters {
	String title;
	String content;
}

public class Book {

	public static void main(String[] args) {
		StudyMaterial sm = new StudyMaterial();
		sm.chapters.title = "Introduction to java";
		sm.chapters.content = "Java is high level programming language..";
		
		System.out.println("Title:  " + sm.chapters.title);
		System.out.println("Content:  " + sm.chapters.content);
	}
}
