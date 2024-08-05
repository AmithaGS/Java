class Chocolate{
	String brand;
	double price;
	String flavour;
	int size=30;     //literal
	
	Chocolate(String brand,double price,String flavour){
		System.out.println("chocolate is created");
		this.brand=brand;
		this.price=price;
		this.flavour=flavour;
	}
	
	public void display(){
		System.out.println("chocolte brand :"+brand);
		System.out.println("chocolte price :"+price);
		System.out.println("chocolte flavour :"+flavour);
		System.out.println("chocolte size :"+size);
	}
	
	public void setChocolate(String brand,double price,String flavour){
		this.brand=brand;
		this.price=price;
		this.flavour=flavour;
	}
	
}