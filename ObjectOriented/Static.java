package ObjectOriented;

public class Static {
	static int a = 100;    // static variables
	static int b;
	
	//static block
	static {
		System.out.println("Static block is executing");
	}

	int x = 200;          // non static variables
	int y;
	
	public static void fun1() {
		System.out.println("static method is executing");
	} 
	
	public void fun2() {
		System.out.println("Non static method is executing");
	} 
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		fun1();
		
		//non static one object is created
		Static st = new Static();
		st.fun2();
		System.out.println(st.x);
		System.out.println(st.y);
	}
}
