package day39_finalKeyword;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	
	public static final String ADMIN_USERNAME;
	
	
	public FinalVariables() {
		
		MODEL_3_MAX_SPEED = 190;
	}
	
	/*
	public FinalVariables(int num) {
		
		MODEL_3_MAX_SPEED = num;
		//ADMIN_USERNAME = "aaa"; //Why coplaining?
	}
	*/
	
	{
		MODEL_X_PASSENGERS = 7;
	}
	
	static {
		
		ADMIN_USERNAME = "abc";
	}
	
	public static void main(String[] args) {
		
		final int MAX_PASSENGER_COUNT = 5;
		//MAX_PASSENGER_COUNT = 10; //You cannot do this
		
		final double PI = 3.14;
		
		final int SSN;
		SSN = 666666;
		//SSN++; //You cannot do this
		
		FinalVariables finalVars = new FinalVariables();
		
		System.out.println("Max range for roadster" + finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed:" + finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Admin:" + ADMIN_USERNAME);
		
		
	}

}
