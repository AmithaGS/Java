package com.advanceJava.serializationANDDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialDemo {

	public static void main(String[] args) {
		try {
			String path = "C://Aug//a2//student.txt";
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student stu = (Student)ois.readObject();
			System.out.println(stu.id + " " + stu.name);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
