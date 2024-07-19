class Paint{
	public static void color(String brand){
		System.out.println("paint is running has 1 String parameter");
		System.out.println("brand: "+brand);
		
	}
	public static void decoration(String brand,String color){
		System.out.println("paint is running has 2 String parameters");
		System.out.println("brand: "+brand);
		System.out.println("color: "+color);

	}
	public static void paintInfo(String brand,double price){
		System.out.println("paint is running has 2 parameters");
		System.out.println("brand: "+brand);
		System.out.println("price: "+price);

	}
	public static void paintDetails(String color,String type,double price){
		System.out.println("paint is running has 3 parameters");
		System.out.println("color: "+color);
		System.out.println("type: "+type);
		System.out.println("price: "+price);
	}
	
}