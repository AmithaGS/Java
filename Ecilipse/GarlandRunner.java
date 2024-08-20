package com.xworkz.engineering;

public class GarlandRunner {

	public static void main(String[] args) {
		Garland garland1=new Garland("Rose",200.0,2);
		Garland garland2=new Garland("lotus",1000,3);
		Garland garland3=new Garland("lilly",500,1);

		Garland[] garlandStore= {garland1,garland2,garland3};
		int garlands=garlandStore.length;
		for(int i=0;i<garlandStore.length;i++) {
			System.out.println("read garlands from index :"+i);
			Garland ref=garlandStore[i];
			ref.displayGarland();
		}
	}

}
