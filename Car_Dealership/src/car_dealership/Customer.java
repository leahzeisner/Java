package car_dealership;

public class Customer extends Dealership {
	
	private String name;
	private String address;
	private double cashOnhand;
	
	public Customer(String name, String address, double cashOnhand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnhand = cashOnhand;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public double getCashOnHand() {
		return this.cashOnhand;
	}
	
	public void setCashOnHand(double amount) {
		this.cashOnhand = amount;
	}
	
	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		employee.handleCustomer(this, finance, vehicle);
	}
}
