class Speaker{
	String brand="Boat";  //literal
	char size;
	double cost;
	String output;
	
	public void display(){
		System.out.println("speaker brand :"+brand);
		System.out.println("speaker size :"+size);
		System.out.println("speaker cost :"+cost);
		System.out.println("speaker output :"+output);
	}
	Speaker(char size,double cost,String output){      //constructor
		this.brand=brand;
		this.size=size;
		this.cost=cost;
		this.output=output;
		System.out.println("speaker is created");
	}
	public void setSpeaker(char size,double cost,String output){       //set method
		this.size=size;
		this.cost=cost;
		this.output=output;
		System.out.println("speaker is created");
	}
	
}