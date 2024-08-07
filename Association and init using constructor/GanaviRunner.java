class GanaviRunner{
	public static void main(String[] args){
		System.out.println("main is running on ganavi runner");
		
		Clip clip=new Clip("Blue","clothes clip");
		Ganavi ganavi= new Ganavi("ganavi04@gmail.com",clip);
		ganavi.Details();
		
		Clip clip1=new Clip("black","hair clip");
		Ganavi ganavi1= new Ganavi("amithags45@gmail.com",clip1);
		ganavi1.Details();
	}
}