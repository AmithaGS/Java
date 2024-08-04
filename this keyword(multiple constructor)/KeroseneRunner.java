class KeroseneRunner
{
	public static void main(String[] args){
		Kerosene kerosene=new Kerosene();
		System.out.println("price of kerosene is: "+kerosene.price);
		System.out.println("quantity of kerosene is: "+kerosene.quantity);
		System.out.println("kerosine is: "+kerosene.quality);
		System.out.println();
		
		Kerosene kerosene1=new Kerosene(300,3,false);
		System.out.println("price of kerosene is: "+kerosene1.price);
		System.out.println("quantity of kerosene is: "+kerosene1.quantity);
		System.out.println("kerosine is: "+kerosene1.quality);
		System.out.println();
		
		Kerosene kerosene2=new Kerosene(20);
		System.out.println("price of kerosene is: "+kerosene2.price);
		System.out.println("quantity of kerosene is: "+kerosene2.quantity);
		System.out.println("kerosine is: "+kerosene2.quality);
		System.out.println();
		
		Kerosene kerosene3=new Kerosene(2000);
		System.out.println("price of kerosene is: "+kerosene3.price);
		System.out.println("quantity of kerosene is: "+kerosene3.quantity);
		System.out.println("kerosine is: "+kerosene3.quality);
		System.out.println();
		
	}
}