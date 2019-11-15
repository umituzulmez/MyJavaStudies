package assignment2;

public class q1 {

	public static void main(String[] args) {
		
		
		/*Question-1
The body mass index (BMI) is used to estimate the risk of weight-related problems based on a subject's height and mass. It was designed by the mathematician Adolphe Quetelet in the 1800s and is sometimes referred to as the Quetelet index. The BMI is computed as:

       BMI = mass / (height * height)

In this formula, mass is in kilograms and height is in meters. The health risk associated with a BMI value is

      - Underweight<18.5

      - Normal Weight>=18.5 and <25

      - Overweight>=25 and <30

      - Obese>=30

In this case study the users input their weight in pounds and height in feet and inches. The program then outputs the BMI and associated health risk. To do this we must first make our program convert from pounds to kilograms. One kilogram is 2.2 pounds. Additionally, the program must convert a height in feet and inches to meters. If we convert the height to all inches, then we can multiply by 0.0254 to convert inches to meters.

Sample Output:

Your weight in pounds :  150

Your height in feet followed by a space then additional inches: 5 5

Your BMI is 25.01349811736

Your risk factory is Overweight
*/
		double BMI, mass, weight, height;
		double weightInPounds, heightInInches, weightInKg, heightInMeter;
		String riskFactory = "Risk Factory"; 
	
		weightInPounds = 150;

		heightInInches = 65;
		
		weightInKg = weightInPounds / 2.2;
		
		heightInMeter = heightInInches * 0.0254;
		
		weight = weightInKg;
		
		height = heightInMeter;
	
		mass = weight;
		
		BMI = mass / (height * height);
		
		System.out.println("BMI is = " + BMI);
		
		if (BMI<18.5) {
			
			System.out.println(riskFactory +" is Underweight");
			
		} else if (BMI>=18.5 && BMI<25) {
			
			System.out.println(riskFactory +" is Normal Weight");
			
		} else if (BMI>=25 && BMI<30) {
			
			System.out.println(riskFactory +" is Overweight");
			
		} else if (BMI>=30) {
			
			System.out.println(riskFactory +" is Obese");
		}
		
	}

}

//int pounds,feet,inches;double heightMeters,mass,BMI;pounds=150;feet=5;inches=5;heightMeters = ((feet * 12) + inches ) * 0.0254;System.out.println(heightMeters);mass = (pounds/2.2);BMI = mass / (heightMeters * heightMeters);System.out.println("Your BMI is " + BMI);if(BMI<18.5) {System.out.println("Your risk category is underweight");}else if(BMI<25) {System.out.println("Your risk category is normal weight");}else if(BMI<30) {System.out.println("Your risk category is overweight");}else {System.out.println("Your risk category is obese");}}}
