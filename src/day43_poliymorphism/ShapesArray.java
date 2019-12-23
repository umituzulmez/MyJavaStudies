package day43_poliymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		
		shapes[0] = new Triangle();
		shapes[1] = new Square();
		shapes[2] = new Circle();
		
		for(Shape sh : shapes) {
			
			System.out.println(sh.getClass().getSimpleName());
			sh.draw();
		}
		
		List<Shape> shapeList = new ArrayList<>(); //polly way
		
		shapeList.add(new Triangle());
		shapeList.add(new Square());
		shapeList.add(new Circle());
		
		

	}

}
