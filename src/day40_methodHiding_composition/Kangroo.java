package day40_methodHiding_composition;

public class Kangroo extends Marsupial{


	public boolean isBiped() {
		
		return true;
	}
	
	/*
	public static boolean isBiped() {
		
		return true;
	}
	*/
	
	public void getKangrooDescription() {
		
		System.out.println("Kangroo hops on two legs: " + isBiped());
	}
	
}
