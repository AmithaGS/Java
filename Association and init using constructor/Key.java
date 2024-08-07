class Key{
	double weight;
	String brand;
	
	Key(double weight,String brand){
		this.weight=weight;
		this.brand=brand;
		System.out.println("key is created by using arguments");
	}
	
	public void detailsKey(){
		System.out.println("key weight :"+weight);
		System.out.println("key brand :"+brand);

	}
}