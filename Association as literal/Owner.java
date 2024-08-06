class Owner{
	String name;
	int age;
	char gender;
	
	Owner(String name,int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.println("owner is created by using arguments");
	}
	
	public void printOwner(){
		System.out.println("owner name :"+this.name);
		System.out.println("owner age :"+this.age);
		System.out.println("owner gender :"+this.gender);
		System.out.println("owner is created with no arguments");

	}
}