package day_22_stringManipulation_Lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		

		String str = "Mr. Brown";
		
		if(str.startsWith("Mr.")) {
			
			System.out.println("He is a married man");
		}else if(str.startsWith("Mrs.")) {
			
			System.out.println("She is a married woman");
		}else if(str.startsWith("Ms.")) {
			
			System.out.println("She is some woman");
		}else if(str.startsWith("Dr.")) {
			
			System.out.println("He/She is a Doctor");
		}else {
			
			System.out.println("Unkonwn status");
		}
		

	}

}
