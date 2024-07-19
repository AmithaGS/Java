class MakeupRunner{
public static void main(String[] forest){
		System.out.println("information of a forest");
		
		if(forest.length==4){
		String name=forest[0];
		String area=forest[1];
		String establishYear=forest[2];
		String state=forest[3];
		System.out.println("name:"+name);
		System.out.println("area:"+area);
		System.out.println("establishYear:"+establishYear);
		System.out.println("state:"+state);
		}
		else{
			System.out.println("not enough to store so add some information in console");
		}
	}
}	