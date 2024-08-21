package com.xworkz.Array;
import com.xworkz.Array.Bike.Dams;

public class DamsRunner {

	public static void main(String[] args) {
		Dams dam1=new Dams();
		dam1.damStore("Vishveswerayya dam");
		dam1.damStore("Sardar sarovar dam");
		dam1.damStore("Nagaruna sagar dam");
		dam1.damStore("Hirakud dam");
		dam1.damStore("Bhakra nangal dam");
		dam1.damStore("Tehri dam");
		dam1.damStore("Ranjit sagar dam");
		dam1.printDamDetails();

	}

}
