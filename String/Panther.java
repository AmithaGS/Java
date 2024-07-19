
// write a class method to take code and return country 

class Panther{
	public static String country(double code){
		System.out.println("country is running on Panther");
		System.out.println("code: "+code);

	if(code==578905){
		return "India";
	}
	if(code==577528){
		return "united states";
	}
	if(code==500601){
		return "united kingdom";
	}
	if(code==567324){
		return "America";
	}
	if(code==564879){
		return "Europe";
	}
	else
		return "no country found";
}

	public static double price(String item){
		System.out.println("price is running on Panther");
		System.out.println("item: "+item);
		
		if(item=="Paddu"){
			return 120;
		}
		if(item=="Palav"){
			return 100;
		}
		if(item=="Masala dosa"){
			return 60;
		}
		if(item=="Biryani"){
			return 200;
		}
		if(item=="kabab"){
			return 300;
		}
		else 
			return 0;
	}
	

	public static String producerName(String movieName){
		System.out.println("producerName is running on Panther");
		System.out.println("movie Name: "+movieName);
		
		if(movieName=="Raajakumara"){
			return "param" ;
		}
		if(movieName=="Anjaniputra"){
			return "tarun sudeer";
		}
		if(movieName=="Kushi"){
			return "umapathy";
		}
		if(movieName=="Most Eligible Bacholor"){
			return "prabhas";
		}
		if(movieName=="Sita Ramam"){
			return "siddarth";
		}
		else 
			return "no movie name found";
	}

}