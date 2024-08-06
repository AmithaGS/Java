class State{
	String name;
	String language;
	CapitalCity capitalCity= new CapitalCity("Bengaluru",98000000);
	
	State(String name,String language){
		this.name=name;
		this.language=language;
		System.out.println("state is created by using arguments");

	}
	
	public void printState(){
		System.out.println("state name is :"+this.name);
		System.out.println("state language is :"+this.language);
		capitalCity.printCapitalCity();
	}
}