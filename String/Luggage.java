
  //    explain method with return as last statement with return method

class Luggage{
	public static String cricketName(int runs){
		System.out.println("runs: "+runs);
		if(runs==40){
			return "KL Rahul";
		}
		else if(runs==100){
			return "Virat Kohli";
		}
			return "Suresh Raina";              			
	}
	
	
	//   Explain method without return as the last statement with return type
     
	public static String checkNumber(int num){
		
		System.out.println("num: "+num);
		if(num>0){
			return "Positive";
		}
		else{
			return "Negative";
		}	
	}
	
	
	                          // Use return with void type
							  

	public static void getNumber(){
	
		int num=10;
		System.out.println("num: "+num);

		if(num>0){
			System.out.println("is a positive number");
			return;
		}
		else{
			System.out.println(" is a negative number");
			return;
		}

	}
}