class MatrimonyRunner{
	public static void main(String[] args){
	Matrimony matrimony=new Matrimony();
	String groomName=matrimony.groomName;
	String brideName=matrimony.brideName;
	int age=matrimony.age;
	System.out.println("groom name is :"+groomName);
	System.out.println("bride name is :"+brideName);
	System.out.println("age :"+age);
	matrimony.groomName="karthik";
	matrimony.brideName="Anushka";
	matrimony.age=25;
	System.out.println(matrimony.groomName);
	System.out.println(matrimony.brideName);
	System.out.println(matrimony.age);
	System.out.println("   ");
	
		Application application=new Application();
	application.applicationNo=1;
	application.applicationName="ssp scholorship";
	application.isApplication=true;
	System.out.println(application.applicationNo);
	System.out.println(application.applicationName);
	System.out.println(application.isApplication);
		System.out.println("   ");
		
	Fruit fruit=new Fruit();
	fruit.fruitName="Mango";
	fruit.quality="good";
	fruit.fruitPrice=45.0;
	System.out.println(fruit.fruitName);
	System.out.println(fruit.quality);
	System.out.println(fruit.fruitPrice);
		System.out.println("   ");	
		
	Juice juice=new Juice();
	juice.juiceName="pineApple";
	juice.quantity=250;
	juice.juicePrice=50;
	System.out.println(juice.juiceName);
	System.out.println(juice.quantity);
	System.out.println(juice.juicePrice);
		System.out.println("   ");	
		
	Place place=new Place();
	place.location="rajajinagara";
	place.isTemple=false;
	place.familyName="gokula";
	System.out.println(place.location);
	System.out.println(place.isTemple);
	System.out.println(place.familyName);
		System.out.println("   ");

	AlcoholBrand alcoholBrand=new AlcoholBrand();
	alcoholBrand.alcoholBrand="KingFisher";
	alcoholBrand.alcoholPrice=500;
	alcoholBrand.isTasty=false;
	System.out.println(alcoholBrand.alcoholBrand);
	System.out.println(alcoholBrand.alcoholPrice);
	System.out.println(alcoholBrand.isTasty);
		System.out.println("   ");	

	Candy candy=new Candy();
	candy.candyName="orange";
	candy.color="orange";
	candy.candyPrice=10;
	System.out.println(candy.candyName);
	System.out.println(candy.color);
	System.out.println(candy.candyPrice);
		System.out.println("   ");	
		
	Medicine medicine=new Medicine();
	medicine.medicineName="zerodol";
	medicine.medicinePrice=120;
	medicine.isCurable=true;
	System.out.println(medicine.medicineName);
	System.out.println(medicine.medicinePrice);
	System.out.println(medicine.isCurable);
		System.out.println("   ");	
		
	Food food=new Food();
	food.foodName="paddu";
	food.foodQuality="Good";
	food.foodCost=50;
	System.out.println(food.foodName);
	System.out.println(food.foodQuality);
	System.out.println(food.foodCost);
		System.out.println("   ");	
	}
}