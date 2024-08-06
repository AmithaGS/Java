class CapitalCity{
	String name;
	long population;
	
	CapitalCity(String name,long population){
		this.name=name;
		this.population=population;
		System.out.println("capital city is created by using arguments");
	}
	
	public void printCapitalCity(){
		System.out.println("capital city name is :"+this.name);
		System.out.println("capital city population is :"+this.population);
		System.out.println("capital city is created with no arguments");

	}
}