package assignment2;

public class q3 {

	public static void main(String[] args) {
		/*Any year is input by the user. Write a program to determine whether the year is a leap year or not.
Leap Years are any year that can be evenly divided by 4.  
A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.

Example : 
1992      Leap Year
2000      Leap Year
1900      NOT a Leap Year
		 */

		int year;
		boolean leapYear;
		
		year = 1992;
		
		leapYear = ((year%4==0) || ((year%100==0 && year%400==0)));
		
		if (leapYear) {
			System.out.println(year + " is a Leap Year");
			
		} else {
			System.out.println(year + " is not a Leap Year");
		}
		
		
		
		
	}

}
