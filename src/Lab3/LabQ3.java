package Lab3;

public class LabQ3 {

	public static void main(String[] args) {
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println("Hi");
		

	}
	
	public static String extraEnd(String str) {
		
		if(str.length()<2) {
		
			return "invalid String";
			
		}else {
		
		str = str.substring(str.length()-2);
		
		return str + str + str;
		
		}
	}		

}
