class Mask{
	double cost;
	char size;
	String material;
	
	Mask(){
		
	}
	Mask(double cost){
		System.out.println("mask is created");
		this.cost=cost;
	}
	Mask(char size){
		System.out.println("mask is created");
		this.size=size;

	}
	Mask(String material){
		System.out.println("mask is created");
		this.material=material;

	}
	Mask(double cost,char size,String material){
		System.out.println("mask is created");
		this.cost=cost;
		this.size=size;
		this.material=material;

	}
	Mask(double cost,char size){
		System.out.println("mask is created");
		this.cost=cost;
		this.size=size;

	}
}