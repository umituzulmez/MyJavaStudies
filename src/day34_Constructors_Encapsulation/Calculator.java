package day34_Constructors_Encapsulation;

public class Calculator {
	
	Floor floor;
	Carpet carpet;
	
	public Calculator(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost() {
		
		return this.floor.getArea()*this.carpet.getCost();
	}

}
