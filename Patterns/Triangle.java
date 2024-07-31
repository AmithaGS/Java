class Triangle{
	public static void main(String[] args){
		int n=6;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){    //spaces are decremented
				System.out.print(" ");
			}
			for(int j=i;j<n;j++){     //* are decremented
				System.out.print("* ");
			}
			for(int j=0;j<i+1;j++){     //* are incremented
				System.out.print("* ");

			}
			System.out.println();

		}
	}
}