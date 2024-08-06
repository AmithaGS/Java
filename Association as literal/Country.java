class Country{
	String name;
	String continent;
	State state= new State("Karnataka","Kannada");
	
	Country(String name,String continent){
		this.name=name;
		this.continent=continent;
		System.out.println("country is created by using arguments");
	}
	
	public void printCountry(){
		System.out.println("country name is :"+this.name);
		System.out.println("country continent is :"+this.continent);
		state.printState();
	}
}