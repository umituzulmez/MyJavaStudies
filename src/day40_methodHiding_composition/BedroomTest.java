package day40_methodHiding_composition;

public class BedroomTest {

	public static void main(String[] args) {
	
		Wall wall1 = new Wall("first");
		Wall wall2 = new Wall("second");
		Wall wall3 = new Wall("third");
		Wall wall4 = new Wall("fourth");
		Ceiling theCeiling = new Ceiling(12, "White");
		Bed theBed = new Bed("Oval", 2, 3, 1, 0);
		Lamp theLamp = new Lamp("round", 2, "smth"); 
		
		Bedroom theBedroom = new Bedroom("Something", wall1, wall2, wall3, wall4, theCeiling, theBed, theLamp);

		theBedroom.makeBed();
		
		theBedroom.getBed().make();
		
		theBedroom.getLamp().turnOn();
				
		
	}

}
