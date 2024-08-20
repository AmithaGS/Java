package com.xworkz.engineering;

public class GaintWheelRunner {

	public static void main(String[] args) {
		GaintWheel gaintWheel1=new GaintWheel(50,100,false);
		GaintWheel gaintWheel2=new GaintWheel(100,300,true);
		GaintWheel gaintWheel3=new GaintWheel(23,400,true);

		GaintWheel[] gaintWheelStore= {gaintWheel1,gaintWheel2,gaintWheel3};
		int gaintWheels=gaintWheelStore.length;
		
		for(int start=0;start<gaintWheelStore.length;start++) {
			System.out.println("read GaintWheel the index :"+start);
			GaintWheel ref = gaintWheelStore[start];
			ref.displayGaintWheel();
		}
	}

}
