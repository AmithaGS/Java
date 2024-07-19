class ParacitamalRunner{
	public static void main(String[] args){
		System.out.println("main in running on paracitalRunner");
		
		if(args.length==9){
			
			// medicineInfo
			
			String name=args[0];
			String manufactureDate=args[1];
			String price=args[2];
			String quantity=args[3];
			
			Integer convertedManufactureDate=Integer.parseInt(manufactureDate);
			Double convertedPrice=Double.parseDouble(price);
			Integer convertedQuantity=Integer.parseInt(quantity);
			
			Paracitamal.medicineInfo(name,convertedManufactureDate,convertedPrice,convertedQuantity);
			
			
			//JuiceInfo
			String juiceName=args[4];
			String brand=args[5];
			String flavour=args[6];
			String juicePrice=args[7];
			String juiceQuantity=args[8];
			
			Double convPrice=Double.parseDouble(juicePrice);
			Integer convQuantity=Integer.parseInt(juiceQuantity);
			
			Juice.juiceInfo(name,brand,flavour,convPrice,convQuantity);
			
		}
			else{
				System.out.println("add 9 arguments about medicine and juice");

			}
	}
	
	
	
	
	
}