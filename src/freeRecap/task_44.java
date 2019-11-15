package freeRecap;

public class task_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kph;
		double kmh;
		
		for(kph = 60; kph<130; kph+=10) {
			kmh = kph * 0.6214;
			System.out.println(kph + "          " + kmh);
		}

	}

}
