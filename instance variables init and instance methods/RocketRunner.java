class RocketRunner{
	public static void main(String[] args){
		Rocket rocket=new Rocket("India",200,10);
		rocket.print();
		rocket.setRocket("Australia",500,20);
		rocket.print();
		System.out.println();

		
		Rocket rocket1=new Rocket("Japan",300,30);
		rocket1.print();
		rocket1.setRocket("Canada",200,40);
		rocket1.print();
		System.out.println();

		
		Rocket rocket2=new Rocket("China",350,25);
		rocket2.print();
		rocket2.setRocket("Afghanistan",600,45);
		rocket1.print();

	}
}