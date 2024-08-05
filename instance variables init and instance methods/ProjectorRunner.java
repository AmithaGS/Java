class ProjectorRunner{
	public static void main(String[] args){
		Projector projector=new Projector("epson","white",20);
		projector.projectorDisplay();
		projector.setProjector("dell","black",30);
		projector.projectorDisplay();
		System.out.println();

		
		Projector projector1=new Projector("lg","pink",40);
		projector1.projectorDisplay();
		projector1.setProjector("epson","white",25.0);
		projector.projectorDisplay();
		System.out.println();

		
		Projector projector2=new Projector("dell","light blue",34.0);
		projector2.projectorDisplay();
		projector2.setProjector("lg","light blue",27.0);
		projector.projectorDisplay();

	}
}