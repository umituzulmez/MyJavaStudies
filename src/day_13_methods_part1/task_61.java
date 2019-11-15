package day_13_methods_part1;

public class task_61 {

	public static void main(String[] args) {
		
		calculateAge(2019,1980);
		calculateAge(2019,1948);

	}
	
	public static void calculateAge(int currentYear, int birthyear) {
		
		int age = currentYear - birthyear;
		
		System.out.println(age);
		
	}

}
