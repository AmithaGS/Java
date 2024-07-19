                                    //Backward direction

class Countries{
	                         //method to take 30 States
	public static void stateNames(String[] names){
		System.out.println(" StateNames are running in Country");
		
			for(int start=names.length-1;start>=0;start--){
				String ref=names[start];
				System.out.println("state name are:"+ref);

			}
	}
                          	//method to take 10 pincode 
	public static void codesOf(int[] pincode){
		System.out.println("pin code are running in Country");
		
		for(int pin=pincode.length-1;pin>=0;pin--){
				int codepins=pincode[pin];
				System.out.println("pincodes are:"+codepins);

			}
	}
	
	                          	//method to take all prime Minister

	public static void ministerNames(String[] primeMinister){
		System.out.println("primeMinister are running in Country");
		
			for(int start=primeMinister.length-1;start>=0;start--){
				String namesOfPrime=primeMinister[start];
				System.out.println("primeMinisters are:"+namesOfPrime);

			}
	}
	                          	//method to take a 30 cabinet Ministers

	
	public static void ministerOfCabinet(String[] cabinetMinisters){
		System.out.println("cabinetMinisters are running in Country");
		
			for(int name=cabinetMinisters.length-1;name>=0;name--){
				String namesOfCabinet=cabinetMinisters[name];
				System.out.println("cabinet Ministers are:"+namesOfCabinet);

			}
	}
	
	                          	//method to take 5 political Parties 

	public static void parties(String[] politicalParties){
		System.out.println("parties are running in Country");
		
			for(int party=politicalParties.length-1;party>=0;party--){
				String names=politicalParties[party];
				System.out.println("political parties are:"+names);
								

			}
	}
	
}