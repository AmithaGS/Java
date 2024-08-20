package com.xworkz.custom_dataType;

public class SubmarineRunner {

	public static void main(String[] args) {
		Submarine submarine1 =new Submarine("INS karanj",100,200.0,50,true); 
		Submarine submarine2 =new Submarine("INS vela",200,400.0,100,true); 
		Submarine submarine3 =new Submarine("INS khanderi",300,500.0,400,false); 
		 
		Submarine[] submarines ={submarine1,submarine2,submarine3};
		
		for(Submarine submarine : submarines) {
			submarine.DetailsMarine();
			System.out.println();
		}
	}

}
