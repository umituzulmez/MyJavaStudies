package Lab3;

public class Q11 {

	public static void main(String[] args) {
		
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("hghibhihfhi"));
		System.out.println(countHi("jbjhbjhiiihiiiihiiihiihihiiihiii"));

	}
	public static int countHi(String str) {
		
		int counter = 0;
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.substring(i,i+2).equals("hi")) {
				
				counter++;
			}
		}
		
		return counter;
	}

}
