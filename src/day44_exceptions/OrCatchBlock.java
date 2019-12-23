package day44_exceptions;

public class OrCatchBlock {

	public static void main(String[] args) {
		
		String str = "abc";
		
		try {
			
			//System.out.println(str.charAt(10));
			String str2 = null;
			System.out.println(str2.toUpperCase());
			
		}catch(IllegalArgumentException | NullPointerException e) { //Exception types can not be sub-parent types, needs to be siblings
			
			System.out.println("Exception happened: " + e.getClass().getSimpleName());
		}

	}

}
