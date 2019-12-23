package day44_exceptions;

public class Nullpointer {

	static String name;
	
	public static void main(String[] args) {
		
		try {
		System.out.println(name.toUpperCase());

		}catch(NullPointerException e) {
			System.out.println("Nullpointerexception happened");
			System.out.println("Her is the message: " + e.getMessage());
			System.out.println("Here is the stackTrace");
			e.printStackTrace();
		}
	}

}
