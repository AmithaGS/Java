class ChocolateRunner{
	public static void main(String[] args){
		Chocolate chocolate=new Chocolate("nestle",200,"chocolate");
		chocolate.display();
		chocolate.setChocolate("amul",100,"strawberry");
		chocolate.display();
		System.out.println();

		
		Chocolate chocolate1=new Chocolate("dairy",300,"chocolate");
		chocolate1.display();
		chocolate1.setChocolate("nestle",150,"mango");
		chocolate.display();
		System.out.println();



		Chocolate chocolate2=new Chocolate("amul",120,"guava");
		chocolate2.display();
		chocolate2.setChocolate("dairy",290,"chocolate");
		chocolate.display();

	}
}