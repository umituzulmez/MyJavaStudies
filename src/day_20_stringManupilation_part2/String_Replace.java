package day_20_stringManupilation_part2;

public class String_Replace {

	public static void main(String[] args) {
		
		String str = "Moscow is a capital of Russia";
		
		str = str.replace("Moscow", "Bakü").replace("Russia", "Azerbaycan");
		
		System.out.println(str);
		
		String email = "firsName_LastName@gmail.com";
		
		String company = "capitalone";
		
		String newEmail = email.replace("gmail", company);
		
		System.out.println(newEmail);
		
		
		

	}

}
