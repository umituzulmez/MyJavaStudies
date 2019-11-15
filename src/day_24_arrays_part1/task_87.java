package day_24_arrays_part1;

import java.util.Scanner;

public class task_87 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] day = new String[7];
		
		day[0] = "Monday";
		day[1] = "Tuesday";
		day[2] = "Wednesday";
		day[3] = "Thursday";
		day[4] = "Friday";
		day[5] = "Saturday";
		day[6] = "Sunday";
		
		System.out.print("Enter the number of the day : ");
		
		int dayNumber = scan.nextInt();
		
		System.out.println("The day is " + day[dayNumber]);
		

	}

}
