class Hospital{
	public static double price(String medicineName){
		System.out.println("price is running on hospital");
		System.out.println("medicineName:"+medicineName);
		if(medicineName=="Citrizen"){
			return 20;
		}
		if(medicineName=="MontacLC"){
			return 50;
		}
		if(medicineName=="Dolo"){
			return 100;
		}
		else {
			return 0;
		}
	}
	public static String medicineName(String symptoms){
		System.out.println("medicineName is running on hospital");
		System.out.println("symptoms:"+symptoms);
		if(symptoms=="cold"){
			return "Citrizen";
		}
		if(symptoms=="fever"){
			return "Dolo";
		}
		if(symptoms=="headache"){
			return "MontacLC";
		}
		else{
			return "no medicine found";
		}
	}
	
	public static Boolean availability(String doctorName){
		System.out.println("availability is running on hospital");
		System.out.println("doctorName:"+doctorName);
		if(doctorName=="Amitha"){
			return true;
		}
		if(doctorName=="Kishor"){
			return true;
		}
		if(doctorName=="Kishan"){
			return true;
		}
		else{
			return false;
		}	
	}
}