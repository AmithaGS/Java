class AeroplaneRunner{
	public static void main(String[] args){
		Aeroplane aeroplane=new Aeroplane();
		System.out.println("company name is: "+aeroplane.company);
		System.out.println("no of seats in aeroplane is: "+aeroplane.noOfSeats);
		System.out.println("ticket price is: "+aeroplane.ticketPrice);
		System.out.println("source is: "+aeroplane.source);
		System.out.println("destination is: "+aeroplane.destination);
		System.out.println();
		
		Aeroplane aeroplane1=new Aeroplane("Air India",150,20000,"bengaluru","USA");
		System.out.println("company name is: "+aeroplane1.company);
		System.out.println("no of seats in aeroplane is: "+aeroplane1.noOfSeats);
		System.out.println("ticket price is: "+aeroplane1.ticketPrice);
		System.out.println("source is: "+aeroplane1.source);
		System.out.println("destination is: "+aeroplane1.destination);
		System.out.println();
		
		Aeroplane aeroplane2=new Aeroplane("Delta","Mysore","united kingdom");
		System.out.println("company name is: "+aeroplane2.company);
		System.out.println("no of seats in aeroplane is: "+aeroplane2.noOfSeats);
		System.out.println("ticket price is: "+aeroplane2.ticketPrice);
		System.out.println("source is: "+aeroplane2.source);
		System.out.println("destination is: "+aeroplane2.destination);
		System.out.println();
		
		Aeroplane aeroplane3=new Aeroplane("SpiceJet",10000,"bengaluru","Australia");
		System.out.println("company name is: "+aeroplane3.company);
		System.out.println("no of seats in aeroplane is: "+aeroplane3.noOfSeats);
		System.out.println("ticket price is: "+aeroplane3.ticketPrice);
		System.out.println("source is: "+aeroplane3.source);
		System.out.println("destination is: "+aeroplane3.destination);
		System.out.println();
	}
}