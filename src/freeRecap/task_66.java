package freeRecap;

public class task_66 {

	public static void main(String[] args) {
		
		int x = distance(70, 5);
		
		System.out.println(x);
		System.out.println(distance(60,9));

	}
	
	public static int distance(int speed, int time) {
		
		int distance = speed * time;
		
		return distance;
		
	}

}
