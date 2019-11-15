package day_20_stringManupilation_part2;

public class task_81 {

	public static void main(String[] args) {
		
	 String date = timeStamp("10/10/2019 14:59:00");
		
	 System.out.println(date);
	 
	}
	
	public static String timeStamp(String date) {
		
		date = date.replace("/", "").replace(":", "").replace(" ", "");
		
		return date;
	}

}
