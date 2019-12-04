package day_40_methodHiding_composition;

public class Lamp {

	private String style;
	private int battery;
	private String globalRating;
	
	public Lamp(String style, int battery, String globalRating) {
		
		this.style = style;
		this.battery = battery;
		this.globalRating = globalRating;
	}

	public void turnOn() {
		
		System.out.println("turning on the lamp");
	}

	public String getStyle() {
		return style;
	}

	public int getBattery() {
		return battery;
	}

	public String getGlobalRating() {
		return globalRating;
	}
	
	
}
