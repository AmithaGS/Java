package com.advanveJava.file.path;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
	public static void main(String[] args) throws IOException {
		String path = "C://Aug//a2//important.txt";
		File file = new File(path);
		
		System.out.println("GET ABSOLUTE PATH: " + file.getAbsolutePath());
		System.out.println("IS HIDDEN: " + file.isHidden());
		System.out.println("IS FILE: " + file.isFile());
		System.out.println("CAN READ: " + file.canRead());
		System.out.println("CAN WRITE: " + file.canWrite());
		System.out.println("CAN EXECUTE: " + file.canExecute());
		System.out.println("NAME OF THE FILE: " + file.getName());
		System.out.println("PARENT NAME OF THE FILE: " + file.getParent());
		System.out.println("GET PATH: " + file.getPath());
		System.out.println("CANONICAL PATH: " + file.getCanonicalPath());
	}
}
