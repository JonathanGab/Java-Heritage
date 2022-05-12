public class Boat extends Vehicles{
	
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	public String doStuff() {
		 return "Je suis " + this.getBrand() + "et je fais glug glug !";
	}
}
