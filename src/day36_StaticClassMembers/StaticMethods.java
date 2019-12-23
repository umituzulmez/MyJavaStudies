package day36_StaticClassMembers;

public class StaticMethods {
	
	
	static String name = "apple";
	
	
	public static void show1() {
		
		System.out.println("Hi");
		
		//show2(); // you can not call instance method/variable from static method
		show4(); // you can call static method from static method
		
		System.out.println(name);
	}
	
	public void show2() {
		
		System.out.println("Hi");
		
		show1(); // you can call static from instance method
		
		System.out.println(name);
	}

	public void show3() {
		
		System.out.println("Hi");
		
		show2(); // you can call instance method from instance method
		show1(); // you can call static method from instance method
		
	}

	public static void show4() {
	
		System.out.println("Hi");
	}
	
}
