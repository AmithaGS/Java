class KeybunchRunner{
	public static void main(String[] args){
		System.out.println("main is running on keybunch runner");
		
		Key key = new Key(2.0,"Steel");
		Keybunch keybunch = new Keybunch("stones keybunch",key);
		keybunch.deatails();  
		
		Key key1 = new Key(5.0,"copper");
		Keybunch keybunch1 = new Keybunch("beats keybunch",key1);
		keybunch1.deatails();
	}
}