class DeliveryGuy{
	public static void deliver(String item){
		System.out.println("deliver is running on DeliveryGuy");
		System.out.println("item: "+item);
		DeliveryVehicle.deliver(item,"Fixed");
	}
	
	public static void main(String[] args){
		System.out.println("main is running on DeliveryGuy");
	    deliver("item");
	}
}