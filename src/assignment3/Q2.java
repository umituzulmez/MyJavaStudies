package assignment3;

public class Q2 {

	public static void main(String[] args) {
		
		
		int mass=240;
		double weight;
		
		weight = mass * 9.8;
		
		System.out.println("Enter an object's mass");
		
		if(weight>1000) {
			
			System.out.println("Too heavy");

		}
		
		if(weight<10){
		
		System.out.println("Too light");
		
		}
		
		else {
			
			System.out.println("Normal weight");
		}
		
	}

}
