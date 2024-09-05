class LogicalOperators{

      //work on boolean values
	public static void main(String[] args){
		int n1=10;
		int n2=3;
		System.out.println("n1 value is: "+n1);
		System.out.println("n2 value is: "+n2);
		
		boolean res1= n1<n2 && n1>n2;
		System.out.println("n1>n2 result is: "+res1);
		
        boolean res2= n1||n2;
		System.out.println("n1<n2 result is: "+res2);
		
		boolean res3= n1!=n2;
		System.out.println("n1==n2 result is: "+res3);

	}
}