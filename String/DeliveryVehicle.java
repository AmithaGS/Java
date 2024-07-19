class DeliveryVehicle{
	public static void deliver(String item,String location){
		System.out.println("deliver is running on DeliveryVehicle");
		System.out.println("item: "+item);
		System.out.println("location: "+location);
		Company.deliver(item,location);
	}
}