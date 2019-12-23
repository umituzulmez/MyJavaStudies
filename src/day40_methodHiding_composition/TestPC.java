package day40_methodHiding_composition;

public class TestPC {

	public static void main(String[] args) {
		
		Dimensions dimensions = new Dimensions(20,20,5);
		
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("Toshiba", "Abc", 22, new Resolution(2540,1440));
		
		MotherBoard theMotherBoard = new MotherBoard("bj-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, theMonitor, theMotherBoard);
		
		
		thePC.getMonitor().drawPixel(1500, 1200, "red");
		
		thePC.getMotherboard().loadProgram("Windows 1.0");
		
		thePC.getTheCase().pressPowerButton();
						
		

	}

}
