public class Hangar{
	
	public static void main(String[] args) {
		
		// create new references
		Car clio = new Car ("Clio", 0);
		
		// set a brand and kilometers for the new ref
		clio.setBrand("Clio");
		clio.setKilometers(250);
		
		// call the methods 
		System.out.println(clio.doStuff());
		
		// create new references
		Boat queen =  new Boat ("Queen Elizabeth 2", 0);
		
		// set a brand and kilometers for the new ref
		queen.setBrand("Queen Elizabeth 2");
		queen.setKilometers(300);
		
		// call the methods
		System.out.println(queen.doStuff());
	}
}