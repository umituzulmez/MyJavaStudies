package day36_StaticClassMembers;

public class Campus {
	
	private String city;
	static String country;
	
	static {
		System.out.println("Static Block1");
		country="USA";
	}
	
	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	
	static {
		System.out.println("Static Block2");
		country="UK";
	}

}
