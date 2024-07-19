                                                //boolean 

class Money{
	public static void main(String[] args){
		boolean isFunTime=true;
		boolean isSpicyFood=false;
		System.out.println("isFunTime:"+isFunTime);
		
		boolean isRaining=true;
		boolean isWinter=false;
		System.out.println("isWinter:"+isWinter);

		boolean isSmaller=(5>3);
		System.out.println("5>3:"+isSmaller);

		boolean isGreater=(21>4);
		System.out.println("21>4:"+isGreater);
		
		boolean isEqualTo=(191==4);
		System.out.println("191==4:"+isEqualTo);
		
		int myAge=21;
		int votingAge=18;
		System.out.println(myAge<=votingAge);

		float salary=60.5f;
		float weight=60.5f;
		System.out.println(salary==weight);
		
		int x=1;
		int y=2;
		System.out.println(x+y>11);
		
		char type='a';
		char symbol='y';
		System.out.println(type!=symbol);

		int number=67;
		boolean isPositive = (number > 0);
		System.out.println("Is the number positive: " +isPositive);


	}
}