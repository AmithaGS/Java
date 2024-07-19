class House{
	public static void watch(String location){
		System.out.println("watch is running on house");
		System.out.println("location: "+location);
		Dog.guarding(location);
	}

	public static void main(String[] args){
		System.out.println("main is running on House");
		watch("Gate");
	}
}