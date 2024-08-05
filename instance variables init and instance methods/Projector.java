class Projector{
	String company;    
	String type="classroom projector";        //literal
	String color;
	double weight;
	
	Projector(String company,String color,double weight){
		this.company=company;
		this.color=color;
		this.weight=weight;
		System.out.println("projector is created");
	}
	
	public void projectorDisplay(){
		System.out.println("projector company :"+company);
		System.out.println("projector type :"+type);
		System.out.println("projector color :"+color);
		System.out.println("projector weight :"+weight);
	}
	
	public void setProjector(String company,String color,double weight){
		this.company=company;
		this.color=color;
		this.weight=weight;
	}
}