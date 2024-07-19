class HostelRunner{
	public static void main(String[] args){
		//Paint
		Paint.color("Nerolac");
		Paint.decoration("AsianPaints","Purple");
		Paint.paintInfo("AsianPaints",800.76);
		Paint.paintDetails("Light Gray","oily based",1290.7);
		System.out.println();
		
		//Train
		Train.book("Bangaluru","Chitradurga");
		Train.book("Bangaluru","Mysore",2);
		Train.book("Mandya","Belagavi",4,1453);
		Train.cancel(65);
		Train.cancel("Chitradurga","Mysore");
		System.out.println();
	
	    //Hostel
		Hostel.hostelInfo("Shimogga",6500.0);
		Hostel.hostelDetails("Davangere","prerana",70000.0);
		Hostel.hostelDetails("Shimogga",65000.0,350);
		Hostel.hostelStudentsInfo("Amitha",450,"Present");
		Hostel.hostelFoodDetails("Palav",200,4,"Not bad");
		System.out.println();
			
	}	
}