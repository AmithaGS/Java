class Keybunch{
	String material;
	Key key;
	
	Keybunch(String material,Key key){
		this.material=material;
		this.key=key;
		System.out.println("keybunch is created by using arguments");
	}
	
	public void deatails(){
		System.out.println("keybunch material :"+material);
		System.out.println("keybunch key :"+key);
		key.detailsKey();
	}
}