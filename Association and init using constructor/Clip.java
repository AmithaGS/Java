class Clip{
	String color;
	String type;
	
	Clip(String color,String type){
		this.color=color;
		this.type=type;
		System.out.println("clip is created by using arguments");

	}
	
	public void detailsClip(){
		System.out.println("clip color :"+color);
		System.out.println("clip type :"+type);

	}
}