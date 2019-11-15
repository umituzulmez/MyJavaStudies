package day_34_Constructors_Encapsulation;

public class Floor {
	
	double length;
	double width;
	
	
	public Floor(double length, double width) {
		
		this.length = length;
		this.width = width;
		
		if(width<0){
			this.width = 0;
			
		}if(length<0){
			this.length = 0;
		}
	}
	
	public double getArea() {
		
		return width*length;
	}

}
