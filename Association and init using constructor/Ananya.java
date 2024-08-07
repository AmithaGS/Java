class Ananya{
	long mobile;
	Knife knife;
	
	Ananya(long mobile,Knife knife){
		this.mobile=mobile;
		this.knife=knife;
		System.out.println("ananya is created");
	}
	
	public void details(){
		System.out.println("Ananya's mobile :"+mobile);
		knife.detailsKnife();
	}
}