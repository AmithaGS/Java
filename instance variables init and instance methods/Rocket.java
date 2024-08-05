class Rocket{
	String country;
	int speed;
	double fuelCapacity=20.0;     //literal
	int noOfThrusters;
	
	Rocket(String country,int speed,int noOfThrusters){
		this.country=country;
		this.speed=speed;
		this.noOfThrusters=noOfThrusters;
		System.out.println("rocket is created");
	}
	
	public void print(){
		System.out.println("rocket country :"+country);
		System.out.println("rocket speed :"+speed);
		System.out.println("rocket fuelCapacity :"+fuelCapacity);
		System.out.println("rocket noOfThrusters :"+noOfThrusters);
	}
	public void setRocket(String country,int speed,int noOfThrusters){
		this.country=country;
		this.speed=speed;
		this.noOfThrusters=noOfThrusters;
	}
}