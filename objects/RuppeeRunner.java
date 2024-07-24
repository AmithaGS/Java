class RuppeeRunner{
	public static void main(String[] args){
		
		System.out.println("main is running on runner");
		Ruppee ruppee=new Ruppee();
		
		String name=ruppee.name;
		String color=ruppee.color;
		int language=ruppee.language;
		System.out.println("Ruppees name :"+name);
		System.out.println("Ruppees color :"+color);
		System.out.println("Ruppees languages :"+language);
		System.out.println("  ");
		
		AirCondition airCondition=new AirCondition();
		String brand=airCondition.brand;
		double price=airCondition.price;
		String airConditionName=airCondition.airConditionName;
		System.out.println("airCondition brand is :"+brand);
		System.out.println("airCondition price is :"+price);
		System.out.println("airCondition name is :"+airConditionName);
		System.out.println("  ");

		AutoRikshaw autoRikshaw=new AutoRikshaw();
		String autoBrand=autoRikshaw.autoBrand;
		double amount=autoRikshaw.amount;
		boolean isLicenced=autoRikshaw.isLicenced;
		System.out.println("autoBrand is :"+autoBrand);
		System.out.println("amount is :"+amount);
		System.out.println("is licenced :"+isLicenced);
		System.out.println("  ");
		
		AutoDriver autoDriver=new AutoDriver();
		String autoOwnerName=autoDriver.autoOwnerName;
		int age=autoDriver.age;
		String bloodGroup=autoDriver.bloodGroup;
		System.out.println("autoOwnerName is :"+autoOwnerName);
		System.out.println("age is :"+age);
		System.out.println("blood group :"+bloodGroup);
		System.out.println("  ");
		
		Rapido rapido=new Rapido();
		String rapidoName=rapido.rapidoName;
		boolean isTwoWheeler=rapido.isTwoWheeler;
		int cost=rapido.cost;
		System.out.println("rapido name is :"+rapidoName);
		System.out.println("isTwoWheeler :"+isTwoWheeler);
		System.out.println("cost :"+cost);
		System.out.println("  ");
		
		CabCompany cabCompany=new CabCompany();
		String location=cabCompany.location;
		int car=cabCompany.car;
		double rent=cabCompany.rent;
		System.out.println("cabCompany location :"+location);
		System.out.println("how many cars:"+car);
		System.out.println("rent of car :"+rent);
		System.out.println("  ");
		
		Bmtc bmtc=new Bmtc();
		int people=bmtc.people;
		String driverName=bmtc.driverName;
		String conductorName=bmtc.conductorName;
		System.out.println("how many peoples are in bmtc:"+people);
		System.out.println("driver name:"+driverName);
		System.out.println("conductor Name :"+conductorName);
		System.out.println("  ");
		
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		String foodCompanyName=foodDeliveryCompany.foodCompanyName;
		int foodItems=foodDeliveryCompany.foodItems;
		double foodPrice=foodDeliveryCompany.foodPrice;
		System.out.println("food company name:"+foodCompanyName);
		System.out.println("food items in menu:"+foodItems);
		System.out.println("food price:"+foodPrice);
		System.out.println("  ");
		
		System.out.println("end is running on runner");

	}
}