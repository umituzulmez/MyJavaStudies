package day6_logicalOperaters;

public class operaterPrecidence {

	public static void main(String[] args) {
		
		int applesCount = 20;
		int orangesCount = 30;
		int pearsCount = 30;
		
		boolean comp = applesCount<orangesCount||orangesCount>=pearsCount; 
		
		// 20<30 || 30>=30 = > T || ---- = T
		
		System.out.println(comp);
		
		String outsideWeather;
		int degree;
		outsideWeather="Shinny";
		degree=70;
		
		boolean comp2 = (!(outsideWeather=="Rainy" || degree==70)); //(!(F||T) = > !T = > false
		
		System.out.println(comp2);
		
		










		

	}

}
