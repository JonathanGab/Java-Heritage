public abstract class Vehicles {

	private String brand;
	private int kilometers;
	// constructor
	public Vehicles(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers;
	}
	// getters and setters for brand
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	// getters and setters for kilometers
	public int getKilometers() {
		return this.kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	// methods
	public abstract String doStuff();
}