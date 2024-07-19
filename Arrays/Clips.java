class ClipsRunner{
	public static void main(String[] person){
		System.out.println("information of a person");
		
		if(person.length==4){
		String name=person[0];
		String email=person[1];
		int age=Integer.parseInt(person[2]);
		String password=person[3];
		System.out.println("name:"+name);
		System.out.println("email:"+email);
		System.out.println("person:"+person);
		System.out.println("password:"+password);
		}
		else{
			System.out.println("not enough to store so add some information in console");
		}
	}
}