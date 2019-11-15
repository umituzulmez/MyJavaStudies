package Lab3;

public class LabQ8 {

	public static void main(String[] args) {
		
		System.out.println(left2("Hello"));
		System.out.println(left2("Java"));
		System.out.println(left2("Hi"));
		

	}
	
	public static String left2(String str) {
		
		String str1 = str.substring(0,2);
		String str2 = str.substring(2);
		
		str = str2.concat(str1);
		
		return str;
	}

}
