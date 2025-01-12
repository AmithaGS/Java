package com.advanceJava.serializationANDDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		Student student = new Student(10, "Sharath");
		System.out.println(student.id +" " + student.name);
		System.out.println("THIS OBJECT WILL BE REMOVED IN 2ms AFTER PROGRAM EXECUTES... ");
		try {
		String path = "C://Aug//a2//student.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
