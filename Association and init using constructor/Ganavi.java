class Ganavi{
	String email;
	Clip clip;
	
	Ganavi(String email,Clip clip){
		this.email=email;
		this.clip=clip;
		System.out.println("ganavi is created by using arguments");
	}
	
	public void Details(){
		System.out.println("Ganavi's email :"+email);
		this.clip.detailsClip();
	}
}