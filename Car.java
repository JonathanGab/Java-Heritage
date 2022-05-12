public class Car extends Vehicles {
	
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		
	}
	public String doStuff() {
		return "I'am a " + this.getBrand() + " and i go zoom zoom";
	}
}