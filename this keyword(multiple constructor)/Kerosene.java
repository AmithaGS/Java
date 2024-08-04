class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	
	Kerosene(){
		
	}
	
	Kerosene(double price,int quantity,boolean quality){
		System.out.println("Kerosene is created:");	
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
	}
	
	Kerosene(int quantity){
		System.out.println("Kerosene is created:");	
		this.quantity=quantity;
	}
	
	Kerosene(double price){
		System.out.println("Kerosene is created:");	
		this.price=price;
	}
}