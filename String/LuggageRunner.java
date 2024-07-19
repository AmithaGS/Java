class LuggageRunner{
	public static void main(String[] args){
		String name1= Luggage.cricketName(150);
		System.out.println("Name1: "+name1);
		
		String name2= Luggage.cricketName(100);
		System.out.println("Name2: "+name2);
		
		String name3= Luggage.cricketName(40);
		System.out.println("Name3: "+name3);
		
		
		String num= Luggage.checkNumber(15);
		System.out.println("num: "+num);
		
		String num1= Luggage.checkNumber(-15);
		System.out.println("num1: "+num1);

	    String num2= Luggage.checkNumber(0);
		System.out.println("num2: "+num2);
		
		Luggage.getNumber();
		

	}
}