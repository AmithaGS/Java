// return value + accept parameters

class AddReturnAccept{
	public static void main(String[] args)
	{
		int sum=add(20,50);
		System.out.println(sum);
	}
	public static int add(int a,int b)
	{
		int res=a+b;
		return res;
	}
}