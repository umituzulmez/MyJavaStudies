package Lab3;

public class Q14 {

	public static void main(String[] args) {
		
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));

	}
	
	public static boolean endsLy(String str) {
		
		if(str.length()>=2) {
			
		if(str.substring(str.length()-2).equals("ly")) {
			
			return true;
			
		}else {
			
			return false;
		}
		
	}else {
		
		return false;
	}

}
}
