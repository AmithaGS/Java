class AnanyaRunner{
	public static void main(String[] args){
		System.out.println("main is running in ananya runner");
		
		Knife knife = new Knife(1.0,20.0);
		Ananya ananya=new Ananya(8073203632l,knife);
		ananya.details();
		
		Knife knife1 = new Knife(3.0,40.0);
		Ananya ananya1=new Ananya(9480599206l,knife1);
		ananya1.details();
	}
}
