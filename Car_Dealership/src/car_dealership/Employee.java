package car_dealership;

public class Employee extends Dealership {
	
	public Employee() {
		
	}
	
	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		
		if (finance) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		} else if (vehicle.getPrice() <= customer.getCashOnHand()) {
			processTransaction(customer, vehicle);
		} else {
			System.out.println("Customer does not have enough money");
		}
	}
	
	public void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Running credit history for customer...");
		System.out.println("Customer has been approved to purchase the vehicle.");
	}
	
	public void processTransaction(Customer customer, Vehicle vehicle) {
		double currentCashOnHand = customer.getCashOnHand();
		double afterPurchase = currentCashOnHand - vehicle.getPrice();
		customer.setCashOnHand(afterPurchase);
		
		System.out.println("Customer has purchased the vehicle: " + vehicle.toString());
	}

}
