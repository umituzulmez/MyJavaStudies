package day40_methodHiding_composition;

public class Marsupial {

	public boolean isBiped() {
		
		return false;
	}
	
	/*
	public static boolean isBiped() {
		
		return false;
	}
	*/
	
	public void getMarsupilDescription() {
		
		System.out.println("Marsupil walks on the two legs: " + isBiped());
	}

}
