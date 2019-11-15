package Lab3;

public class Q17 {

	public static void main(String[] args) {
		
		System.out.println(palindrome("level"));
		System.out.println(palindrome("madam"));
		System.out.println(palindrome("Wow"));
		System.out.println(palindrome("Taco cat"));
		

	}
	
	public static boolean palindrome(String str) {
		
		String str1 = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			str1 = str1 + str.charAt(i);
			
		}
		
		/* if(str.equals(str1)) { */  if(str.replace(" ", "").equalsIgnoreCase(str1.replace(" ",""))){
			
			return true;
			
			
		}else {
			
			return false;
		}
		
	}
}
