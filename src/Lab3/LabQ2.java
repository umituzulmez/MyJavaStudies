package Lab3;

public class LabQ2 {

	public static void main(String[] args) {
		
		System.out.println(makeAbba("a","b"));
		System.out.println(makeAbba("Hi","Bye"));
		System.out.println(makeAbba("Yo","Alice"));
		System.out.println(makeAbba("What","Up"));

	}
	
	public static String makeAbba(String str1, String str2) {
		
		return str1.concat(str2).concat(str2).concat(str1);
		
	}

}
