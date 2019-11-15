package Lab3;

public class LabQ9 {

	public static void main(String[] args) {
		
		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));
		System.out.println(right2("Hi"));

	}
	public static String right2(String str) {
		
		String str1 = str.substring(str.length()-2);
		String str2 = str.substring(0,str.length()-2);
		
		str = str1.concat(str2);
		
		return str;
	}

}
