class MemberRunner{
	public static void student(char section,String name){
		System.out.println("Student is running on member");
		System.out.println("section:"+section);
		System.out.println("name:"+name);

	}
	public static void employee(int id,String job,double salary){
		System.out.println("id:"+id);
		System.out.println("number:"+job);
		System.out.println("salary:"+salary);
		if(salary>500000){
			System.out.println("experience:"+salary);
		}
		else{
			System.out.println("fresher:"+salary);

		}
	}

	public static void main(String[] args){
	System.out.println("main is running");
	student('A',"Amitha");
	employee(1,"testing",5200000);
	}
}