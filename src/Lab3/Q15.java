package Lab3;

public class Q15 {

	public static void main(String[] args) {
		
		System.out.println(hasBad("badxxx"));
		System.out.println(hasBad("xbadxxx"));
		System.out.println(hasBad("xxbadxxx"));
	}

	public static boolean hasBad(String str) {
		
		boolean b = true;
		
		for(int i = 0; i<2; i++) {
			
			if(str.substring(i,i+3).equals("bad")) {
				
				b = true;
				
				break; // very important break;
				
			}else {
			
				b = false;
		
			}
		}
		
		return b;
	}
}
