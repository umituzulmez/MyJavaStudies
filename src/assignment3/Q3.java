package assignment3;

public class Q3 {

	public static void main(String[] args) {
		
		
		int second=96408;
		int minute=0;
		int hour=0;
		int day=0;
		
		if(second>=60) {
			minute=second/60;
			second=second%60;
		
		}
		if(minute>=60) {
			hour=minute/60;
			minute=minute%60;
		
		}
		if(hour>=24) {
			day=hour/24;
			hour=hour%24;
			
		}
		
		System.out.println(day + " day " + hour + " hour " + minute + " minute " + second + " second");


}
}