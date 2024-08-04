class MirrorRightAngled{
	public static void main(String[] args){
		int n=6;
		for(int i=1;i<=n;i++){
			for(int k=1;k<=n-i;k++){     //spaces increment
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){    //* are decremented so its starts from i to n
				System.out.print("*");

			}
				System.out.println(" ");
		}
	}
}