package Lab3;

public class LabQ7 {

	public static void main(String[] args) {
		
		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aaa", "b"));
		System.out.println(comboString("aaa", "bbb"));

	}
	
	public static String comboString(String a, String b) {
		
		String str = "";
		
		if(a.length()>b.length()){
			
			str = b.concat(a).concat(b);
			
		}else if(a.length()<b.length()){
		
			str = a.concat(b).concat(a);
		
		}else {
			
			str = "Invalid";
		
		}
		
			return str;
	}

}
