class Paper{
	 double paperThickness=1.5;    //literal
	 char size;
	 String quality;
	 String color;
	 
	 Paper(char size, String quality,String color){    //constructor
		 this.size=size;
		 this.quality=quality;
		 this.color=color;
		 System.out.println("paper is created");
	 }
	 public void paperDisplay(){
		 System.out.println("paper thickness is :"+paperThickness);
		 System.out.println("paper size is :"+size);
		 System.out.println("paper quality is :"+quality);
		 System.out.println("paper color is :"+color);
	 }
	 
	 public void setPaper(char size, String quality,String color){
		 this.size=size;
		 this.quality=quality;
		 this.color=color;
	 }
	 
	 
}