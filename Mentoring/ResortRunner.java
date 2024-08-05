class ResortRunner{
	public static void main(String[] args){
		double price1=Resort.price("summerPrice",true);
		System.out.println("price of summer price along with food is :"+price1);
		
		double price2=Resort.price("winterPrice",true);
		System.out.println("price of winter price along with food is :"+price2);
		
		double price3=Resort.price("mansoonPrice",true);
		System.out.println("price of mansoon price along with food is :"+price3);

	}
}