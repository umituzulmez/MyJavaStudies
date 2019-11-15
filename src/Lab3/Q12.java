package Lab3;

public class Q12 {

	public static void main(String[] args) {
		
		System.out.println(catDog("catdogcat"));
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catdogcatdogcat"));

	}
	
	public static boolean catDog(String str) {
		
		int cat = 0;
		int dog = 0;
		
		for(int i = 0; i<str.length()-2; i++) {
			
			if(str.substring(i,i+3).equals("cat")){
				
				cat++;	
				
			}if(str.substring(i,i+3).equals("dog")){
				
				dog++;
			}
		}
		
		System.out.println("Number of cat: " + cat);
		System.out.println("Number of dog: " + dog);
		
		if(cat==dog) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
}
