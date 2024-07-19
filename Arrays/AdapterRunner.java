class AdapterRunner{
	public static void main(String[] palace){
		System.out.println("information of a palace");
		
		if(palace.length==4){
		String name=palace[0];
		String location=palace[1];
		String builtBy=palace[2];
		String buildYear=palace[3];
		System.out.println("name:"+name);
		System.out.println("location:"+location);
		System.out.println("builtBy:"+builtBy);
		System.out.println("buildYear:"+buildYear);
		}
		else{
			System.out.println("not enough to store so add some information in console");
		}
	}
}