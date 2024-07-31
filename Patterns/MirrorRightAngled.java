class MirrorRightAngled{
	public static void main(String[] args){
		int n=6;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){     //spaces increment
				System.out.print(" ");
			}
			for(int j=i;j<n;j++){    //* are decremented so its starts from i to n
				System.out.print("*");

			}
				System.out.println(" ");
		}
	}
}