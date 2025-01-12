// Annotations: is a type of metadata that we can add to code

package com.advanceJava.Annotations;

import java.util.ArrayList;
@SuppressWarnings("deprecation")
public class Demo {
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int a = 10;
		
		Demo1 d2 = new Demo2();
		d2.sample();
		d2.greet();    // it gives warning so use @SuppressWarnings
		
		
		@SuppressWarnings({"rawtypes", "unused"})
		ArrayList al = new ArrayList<>();    // Arraylist is a rawtypes   and al is unused
	}
}
