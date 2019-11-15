package freeRecap;

public class task_65 {

	public static void main(String[] args) {
		
		calculateGrade(80,90,100);
		calculateGrade(100,45,80);
		calculateGrade(60,50,70);
		calculateGrade(45,87,32);
		calculateGrade(120,350,100);
		
		
	}
	
	public static void calculateGrade(int grade1, int grade2, int grade3 ) {
		
		int averageOfGrades = (grade1 + grade2 + grade3) / 3;
		
		if(averageOfGrades<=100 && averageOfGrades>=90) {
			
			System.out.println("Your Grade is : A" );
			
		}else if(averageOfGrades<90 && averageOfGrades>=80) {
			
			System.out.println("Your Grade is : B" );
			
		}else if(averageOfGrades<80 && averageOfGrades>=70) {
			
			System.out.println("Your Grade is : C" );
			
		}else if(averageOfGrades<70 && averageOfGrades>=60) {
			
			System.out.println("Your Grade is : D" );
			
		}else if(averageOfGrades<60 && averageOfGrades>=0) {
			
			System.out.println("Your Grade is : F" );
			
		}else {
			
			System.out.println("Invalid Input");
		}
		
	}

}
