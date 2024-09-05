// Return value + no parameters

class AddReturnValue{
	public static void main(String[] args)
	{
		int add=addNum();
		System.out.println(add);

	}
	public static int addNum()
	{
		int a=100;
		int b=20;
		int res=a+b;
		return res;
	}
}