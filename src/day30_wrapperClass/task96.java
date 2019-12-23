package day30_wrapperClass;

import java.util.Arrays;

public class task96 {

	public static void main(String[] args) {
		
	String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";

	String [] array = str1.split(" ");
	
	double number = Double.parseDouble(array[5]);
	
	double celcius = 0;
	
	celcius = (number -32) * 5/9;
	
	System.out.println(number + " degree is equal to " + Math.round(celcius) + " celcius");
	
	
//	String str1 = "Today weather is sunny and 89 degree. It is a perfect day to practice java.";
//	
//	String[] arr = str1.split("and ");
//
//	arr = arr[1].split(" degree");
//	
//	String degree = arr[0];
//	
//	double degreeF = Double.parseDouble(degree);
//	
//	double degreeC = (degreeF - 32) * 5/9;
//	
//	System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");
//






	}

}
