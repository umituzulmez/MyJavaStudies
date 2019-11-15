package Lab3;

public class LabQ10 {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));

		
	}
	
	public static boolean frontAgain(String str) {
		
		if((str.substring(0,2)).equals(str.substring(str.length()-2))) { // cannot use == because it compares the objects (reference) not contents (value)
			
			return true;
			
		}else {
			
			return false;
		}
		
	}

}
