class Train{
	public static void book(String source,String destination){
		System.out.println("Train is running has 2 parameters");
		System.out.println("source: "+source);
		System.out.println("destination: "+destination);

	}
	public static void book(String source,String destination,int quantity){
		System.out.println("Train is running has 3 parameters");
		System.out.println("source: "+source);
		System.out.println("destination: "+destination);
		System.out.println("quantity: "+quantity);

	}
	public static void book(String source,String destination,int quantity,double price){
		System.out.println("Train is running has 4 parameters");
		System.out.println("source: "+source);
		System.out.println("destination: "+destination);
		System.out.println("quantity: "+quantity);
		System.out.println("price: "+price);

	}
	public static void cancel(int ticketNo){
		System.out.println("Train is running has 1 parameter to cancel");
		System.out.println("ticketNo: "+ticketNo);
	}
	public static void cancel(String source,String destination){
		System.out.println("Train is running has 2 parameter to cancel");
		System.out.println("source: "+source);
		System.out.println("destination: "+destination);
	}

}