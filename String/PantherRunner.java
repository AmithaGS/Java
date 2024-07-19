class PantherRunner{
	public static void main(String[] args){
		String note= Panther.country(578905);
		System.out.println("note: "+note);

		String phone= Panther.country(564879);
		System.out.println("phone: "+phone);

		String mobile= Panther.country(567324);
		System.out.println("mobile: "+mobile);

		String tab= Panther.country(500601);
		System.out.println("tab: "+tab);

		String note1= Panther.country(577528);
		System.out.println("note1: "+note1);
		
		String mobile1= Panther.country(577628);
		System.out.println("mobile1: "+mobile1);

        System.out.println("     ");
		
	    double item1= Panther.price("Paddu");
		System.out.println("item1: "+item1);

	    double item2= Panther.price("Palav");
		System.out.println("item2: "+item2);
		
	    double item3= Panther.price("Biryani");
		System.out.println("item3: "+item3);

	    double item4= Panther.price("Kabab");
		System.out.println("item4: "+item4);
		
	    double item5= Panther.price("Masala dosa");
		System.out.println("item5: "+item5);
		
	    double item6= Panther.price("Curd rice");
		System.out.println("item6: "+item6);
		
	    System.out.println("   ");
		
		String producer1= Panther.producerName("Raajakumara");
		System.out.println("producer1 name: "+producer1);

		String producer2= Panther.producerName("Anjaniputra");
		System.out.println("producer2 name: "+producer2);

		String producer3= Panther.producerName("Kushi");
		System.out.println("producer3 name: "+producer3);

		String producer4= Panther.producerName("Most Eligible Bacholor");
		System.out.println("producer4 name: "+producer4);

		String producer5= Panther.producerName("Sita Ramam");
		System.out.println("producer5 name: "+producer5);
		
		String producer6= Panther.producerName("allu arjun");
		System.out.println("producer6 name: "+producer6);
		
		System.out.println("   ");
		
		double tablet1= Hospital.price("Citrizen");
		System.out.println("tablet1 price: "+tablet1);
		
		double tablet2= Hospital.price("Dolo");
		System.out.println("tablet2 price: "+tablet2);
		
		double tablet3= Hospital.price("MontacLC");
		System.out.println("tablet3 price: "+tablet3);
		
		double tablet4= Hospital.price("Paracetamal");
		System.out.println("tablet4 price: "+tablet4);
		
				System.out.println("   ");
				
		String medicine1= Hospital.medicineName("cold");
		System.out.println("medicine1 is: "+medicine1);	

		String medicine2= Hospital.medicineName("fever");
		System.out.println("medicine2 is: "+medicine2);
		
		String medicine3= Hospital.medicineName("headache");
		System.out.println("medicine2 is: "+medicine3);	
		
		String medicine4= Hospital.medicineName("stomachPain");
		System.out.println("medicine4 is: "+medicine4);	

				System.out.println("   ");	

		Boolean doctorAvailable1= Hospital.availability("Amitha");
		System.out.println("doctor1 is available : "+doctorAvailable1);	
		
		Boolean doctorAvailable2= Hospital.availability("Kishan");
		System.out.println("doctor2 is available : "+doctorAvailable2);	
		
		Boolean doctorAvailable3= Hospital.availability("Kishor");
		System.out.println("doctor3 is available : "+doctorAvailable3);	

		Boolean doctorAvailable4= Hospital.availability("Leela");
		System.out.println("doctor4 is available : "+doctorAvailable4);
	}

}