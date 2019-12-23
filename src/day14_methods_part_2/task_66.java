package day14_methods_part_2;

public class task_66 {

	public static void main(String[] args) {
		
		int distanceTraveled= distance(120, 5);
		
		System.out.println(distanceTraveled);

	}

		public static int distance(int speed, int time) {
		
			int distanceTraveled = speed * time;
			
			return distanceTraveled;
			
			
		
	}
	
	

}
