package day_20_stringManupilation_part2;

public class String_Replace2 {

	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpace = sentence.replace(" ", "");
		
		System.out.println(withNoSpace);
		
		System.out.println(sentence);
		
		sentence = sentence.replace(",", "!!!");
		
		System.out.println(sentence);
		
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@" , "");
		
		System.out.println(mixed);
		
		String result = "Yaklaşık 7.090.000.000 sonuç bulundu (0,38 saniye) ";
		
		String result2 = result.replace("Yaklaşık ", "").replace(" sonuç bulundu (0,38 saniye) ", "");
		
		System.out.println(result2);
		
		

	}

}
