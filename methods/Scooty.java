                                                              //StackOverFlow

class Scooty{
	
	public static void engine(){
		System.out.println("engine runs smoothly");
		battery();
		seat();
	}
	
	public static void battery(){
		System.out.println("battery charges fastly");
		seat();
		engine();
	}
	
	public static void seat(){
		System.out.println("cars seat is flexible");
		engine();
		battery();
	}
	
	public static void main(String[] args)
	{
		System.out.println("scooty is running in main road");
		Scooty.engine();
	}
}