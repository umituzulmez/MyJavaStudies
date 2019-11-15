package Lab3;

public class Q13 {

	public static void main(String[] args) {
		
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("Hi-there"));

	}
	
	public static String doubleChar(String str) {
		
		String str2 = "";
		
		for(int i = 0; i<str.length(); i++) {
			
			str2 = str2 + str.substring(i,i+1).concat(str.substring(i,i+1));
			
		}
		
		return str2;
	}

}
