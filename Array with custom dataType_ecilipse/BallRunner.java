package com.xworkz.custom_dataType;

public class BallRunner {

	public static void main(String[] args) {
		Ball ball1 = new Ball("vickey ball","green",5,20.0,"rubber ball",20,"plastic",5.0);
		Ball ball2 = new Ball("throw ball","white",10,30.0,"rubber ball",30,"rubber",10.0);
		Ball ball3 = new Ball("valley ball","blue",15,50.0,"rubber ball",40,"rubber",15.0);

		Ball[] balls=new Ball[3];
		balls[0]=ball1;
		balls[1]=ball2;
		balls[2]=ball3;
		
		 for(Ball ball : balls) {
			 ball.printBallDetails();
			 System.out.println();
		 }
	}

}
