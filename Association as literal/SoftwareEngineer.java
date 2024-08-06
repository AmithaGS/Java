class SoftwareEngineer{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEngineer(String name,int experience,String designation,double salary){
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
		System.out.println("software engineer is created by using arguments");
	}
	
	public void printSoftwareEngineer(){
		System.out.println("SoftwareEngineer name :"+this.name);
		System.out.println("SoftwareEngineer experience :"+this.experience);
		System.out.println("SoftwareEngineer designation :"+this.designation);
		System.out.println("SoftwareEngineer salary :"+this.salary);
		System.out.println("SoftwareEngineer is created with no arguments");

	}
}