package day_39_finalKeyword;

public class Mouse extends Rodent{

	protected int tailLength = 8;
	
	public void getMouseDetails() {
		
		System.out.println("tail : " + tailLength + ", parentTail : " + super.tailLength);
	}
}
