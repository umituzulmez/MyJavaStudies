package Lab3;

public class LabQ5 {

	public static void main(String[] args) {
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		

	}

	public static String firstHalf(String str) {
		
		return str.substring(0,(str.length()/2));
	}
}
