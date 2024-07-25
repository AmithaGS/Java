class ChargerRunner{
	public static void main(String[] args){
		Charger charger= new Charger();
		System.out.println("type of charger is: "+charger.type);
		charger.cost=900;
		System.out.println("cost of charger is: "+charger.cost);
		charger.length=250;
		System.out.println("length of charger is: "+charger.length);
		System.out.println("  ");
		
		Claw claw= new Claw();
		System.out.println("length of claws is:"+claw.clawLength);
		claw.birdName="pigeon";
		System.out.println("bird name of who has claw: " +claw.birdName);
		claw.isClaws=true;
		System.out.println("bird have claws: " +claw.isClaws);
				System.out.println("  ");


		Crow crow=new Crow();
		crow.color="black";
		System.out.println("color of crow: " +crow.color);
		System.out.println("crows make sound:"+crow.isMakeSound);
		crow.typesOfCrows=10;
		System.out.println("types of crow: " +crow.typesOfCrows);
				System.out.println("  ");

		
		Clock clock=new Clock();
		System.out.println("brand of clock is: "+clock.brand);
		clock.amount=500;
		System.out.println("amount of clock: " +clock.amount);
		clock.color="pink";
		System.out.println("color of crow: " +clock.color);
				System.out.println("  ");

		Lollipop lollipop= new Lollipop();
		lollipop.flavour="chocolate";
		System.out.println("flavour of lollipop: " +lollipop.flavour);
		System.out.println("cost of lollipop is: "+lollipop.costOfLollipop);
		lollipop.isTasty=false;
		System.out.println("lollipop is tasty: " +lollipop.isTasty);
				System.out.println("  ");

		
		Jean jean= new Jean();
		System.out.println("type of jean is: "+jean.jeanType);
		jean.jeanPrice=1000;
		System.out.println("jean price: " +jean.jeanPrice);
		jean.quantity=10;
		System.out.println("quantity of jean: " +jean.quantity);
				System.out.println("  ");

		Keyboard keyboard= new Keyboard();
		System.out.println("number of keyboard buttons are: "+keyboard.buttons);
		keyboard.keyboardBrand="hp";
		System.out.println("brand of keyboard: " +keyboard.keyboardBrand);
        keyboard.isWorking=true;
		System.out.println("keyboard is working: " +keyboard.isWorking);
				System.out.println("  ");

		Mountain mountain= new Mountain();
		System.out.println("mountain name is: "+mountain.mountainName);
		mountain.height=120;
		System.out.println("mountain height is: " +mountain.height);
		mountain.location="Jammu and kashmir";
		System.out.println("location of mountain is: " +mountain.location);
				System.out.println("  ");

		Stadium stadium= new Stadium();
		System.out.println("stadium name is: "+stadium.stadiumName);
		stadium.width=800;
		System.out.println("stadium width is: " +stadium.width);
		stadium.locationOfStadium="Bengaluru";
		System.out.println("stadium location is: " +stadium.locationOfStadium);
				System.out.println("  ");

		Spray spray= new Spray();
		System.out.println("cost of spray is: "+spray.sprayCost);
		spray.sprayName="move";
		System.out.println("spray name is: " +spray.sprayName);
		spray.quality="good";
		System.out.println("spray quality is: " +spray.quality);

	}
}