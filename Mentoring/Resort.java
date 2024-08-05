class Resort{
	static double summerPrice=20000;
	static double winterPrice=35000;
	static double mansoonPrice=45000;
	static double foodPrice=5000;
	


	public static double price(String packages,boolean addFood){
		double totalSummerPrice=0;
		if(packages=="summerPrice"){
			if(addFood==true){
				totalSummerPrice=summerPrice+foodPrice;
				return totalSummerPrice;
			}
			else{
				return summerPrice;
			}
		}
		
		else if(packages=="winterPrice"){
			
			if(addFood==true){
				totalSummerPrice=winterPrice+foodPrice;
				return totalSummerPrice;
			}
			else{
				return winterPrice;
			}
		}
		
		else if(packages=="mansoonPrice"){
			
			if(addFood==true){
				totalSummerPrice=mansoonPrice+foodPrice;
				return totalSummerPrice;
			}
			else{
				return mansoonPrice;
			}
		
		
	}
	return totalSummerPrice;
	}

}