package com.xworkz.inheritancee;
import com.xworkz.inheritance.store.Bull;
import com.xworkz.inheritance.store.Calf;

public class CalfRunner {

	public static void main(String[] args) {
		Calf calf=new Calf();
		calf.location="mumbai";
		calf.color="black";
		calf.weight=102.56;
		calf.runSpeed=120;
		calf.hornShape="curved";
		calf.bullLocation();
		calf.bullColor();
		calf.bullWeight();
		calf.bullRunSpeed();
		calf.bullHornShape();
		System.out.println();
		
		Bull bull=new Calf();
		bull.location="gujurat";
		bull.color="brown";
		bull.weight=150.56;
		bull.runSpeed=110;
		bull.hornShape="curved";
		bull.bullLocation();
		bull.bullColor();
		bull.bullWeight();
		bull.bullRunSpeed();
		bull.bullHornShape();
	}
}


