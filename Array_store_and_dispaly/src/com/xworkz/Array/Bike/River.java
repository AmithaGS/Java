package com.xworkz.Array.Bike;

public class River {
	private String[] rivers=new String[7];
	private int index=0;
	
	public void storeRiverNames(String riverName) {
		rivers[index]=riverName;
		index++;
	}
	public void printRiverDetails() {
		for(String river: rivers) {
			System.out.println("river names are: "+river);
		}
	}
}
