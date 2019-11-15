package assignment3;

public class Q7 {

	public static void main(String[] args) {
		
		
		String object = "water";
		
		int distance = 3000000;
		int time;
	
		switch(object) {
			
			case "air":
				time = distance / 1100;
				System.out.println("The time of the sound travel in air is = " + time + " seconds");
				break;
			
			case "water":
				time = distance / 4900;
				System.out.println("The time of the sound travel in water is = " + time + " seconds");
				break;
			
			case "steel":
				time = distance / 16400;
				System.out.println("The time of the sound travel in steel is = " + time + " seconds");
				break;
			
			default:
				System.out.println("Not valid object");
		
		}
		
	}

}
