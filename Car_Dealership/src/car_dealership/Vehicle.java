package car_dealership;

public class Vehicle extends Dealership {
	
	private String make;
	private String model;
	private double price;
	
	public Vehicle(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "\"" +this.make + " " + this.model + "\", $" + this.price + ".";
	}
	
}
