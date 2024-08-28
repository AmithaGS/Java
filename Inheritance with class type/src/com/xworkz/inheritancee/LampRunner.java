package com.xworkz.inheritancee;

import com.xworkz.inheritance.store.Bulb;
import com.xworkz.inheritance.store.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		Lamp lamp=new Lamp();
		lamp.price=500;
		lamp.light();
		System.out.println();
		Bulb bulb = new Bulb();
		bulb.price=400;
		bulb.light();
	}

}
