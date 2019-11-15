package day_16_classes_objects;

public class Car_objects {

	public static void main(String[] args) {
		

		Car car1 = new Car();
		
		car1.printCarInfo();
		
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();
		
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		
		car1.drive();
		
		System.out.println("before : " + car1.currentSpeed);
		
		car1.accelerate(20);
		
		System.out.println("after : " + car1.currentSpeed);

	}

}
