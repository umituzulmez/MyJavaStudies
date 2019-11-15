package assignment3;

public class Q6 {

	public static void main(String[] args) {
		
		
		double numberOfCalories=350;
		double fatGrams=30;
		double caloriesFromFat;
		double percentageOfCaloriesFromFat;
		
		caloriesFromFat = fatGrams * 9;
		
		percentageOfCaloriesFromFat = caloriesFromFat / numberOfCalories;
		
		

		if(caloriesFromFat<(numberOfCalories * 0.30)) {
			
			System.out.println("The percentage of Calories from Fat is = " + percentageOfCaloriesFromFat);
			
			System.out.println("The food is low in fat");
			
		}
		if((caloriesFromFat>=(numberOfCalories * 0.30)) && (caloriesFromFat<numberOfCalories)) {
			
			System.out.println("The percentage of Calories from Fat is = " + percentageOfCaloriesFromFat);
			
			System.out.println("The Food is high in fat");
			
		}
		if(caloriesFromFat>=numberOfCalories) {
			
			System.out.println("The input is invalid");
		
		
		}
		

	}

}
