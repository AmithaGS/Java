class Knife{
	double weight;
	double height;
	
	Knife(double weight,double height){
		this.weight=weight;
		this.height=height;
		System.out.println("knife is created");
	}
	
	public void detailsKnife(){
		System.out.println("knife weight :"+weight);
		System.out.println("knife height :"+height);

	}
	
}