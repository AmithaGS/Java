class RestorantRunner{
	public static double price(String food,String addItem){
		
		if(food=="northIndianTaali"){
			if(addItem=="iceCream"){	
				return 1090;
			}
			else{
				return 1000;
			}
		}
		
		else if(food=="southIndianTaali"){
			if(addItem=="iceCream"){
				return 890;
			}
			else{
				return 800;
			}
		}
		else {
			return 90;
		}
	}
	public static void main(String[] args){
		double northIndianTaali=1000;
		double southIndianTaali=800;
		double iceCream=90;
		
		System.out.println("1.North Indian Taali: Rs"+northIndianTaali);
		System.out.println("2.south Indian Taali: Rs"+southIndianTaali);
		System.out.println("3.includes icecream: Rs"+iceCream);
		
		double food1=price("northIndianTaali","iceCream");
		System.out.println("northIndianTaali food along with iceCream rupees is:"+food1);
		double food2=price("southIndianTaali","iceCream");
		System.out.println("southIndianTaali food along with iceCream rupees is:"+food2);
	
		
	}
}