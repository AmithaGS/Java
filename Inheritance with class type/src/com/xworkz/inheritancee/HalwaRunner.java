package com.xworkz.inheritancee;
import com.xworkz.inheritance.store.Halwa;
import com.xworkz.inheritance.store.Jamoon;
import com.xworkz.inheritance.store.Halwa;

public class HalwaRunner {

	public static void main(String[] args) {
		Jamoon jamoon = new Jamoon();
		jamoon.name="GRB jamoon";
		jamoon.price=200;
		jamoon.isSweety=true;
		jamoon.sweetName();
		jamoon.sweetPrice(); 
		System.out.println();
		Halwa halwa = new Halwa();
		halwa.name="Kaaju barfi";
		halwa.price=280;
		halwa.isSweety=true;
		halwa.sweetName();
		halwa.sweetPrice();
		
		
	}

}
