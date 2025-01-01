package com.inputOutput.FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutput {
	public static void main(String[] args) {
		try {
			String path1 = "C://Aug//input.txt";
			String path2 = "C://Aug//output.txt";
			
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			int x;
			
			while ((x = fis.read())!= -1) {
				fos.write(x);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
