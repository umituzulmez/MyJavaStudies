package freeRecap;

public class task_68 {

	public static void main(String[] args) {
		
		//int x = 1980;
				
		//calculateAge(1980);
		
		yearsUntilRetirement("Mike",1990);

	}

	public static int calculateAge(int yearBirth) {
		
		int age = 2019 - yearBirth;
		
		return age;
		
		
	}

	public static void yearsUntilRetirement(String name, int year) {
		
		int retirementyear = 65 - calculateAge(year);
		
		System.out.println(name + " retires in " + retirementyear + " years." );
		
		
	}

}
