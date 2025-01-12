package com.advanveJava.file.path;

import java.util.Scanner;

public class ErrorStream {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		System.out.print("Hello Welcome ");
		System.err.println(name);     // print in red color
	}
}
