class Hotel{
	String name="bengaluru tiffin room";     //literal
	Owner owner=new Owner("Chandana",21,'F');
	
	public void printHotel(){
		System.out.println("hotel name: "+this.name);
		owner.printOwner();
	}
}