class Bike{
	
	public static void engine(){
		System.out.println("engine runs smoothly");
	}
	
	public static void battery(){
		System.out.println("battery charges fastly");
	}
	
	public static void main(String[] args)
	{
		System.out.println("bike is running in main road");
		Bike.engine();
		Bike.battery();
	}
}
