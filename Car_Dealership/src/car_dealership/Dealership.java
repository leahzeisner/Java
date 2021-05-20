package car_dealership;

public class Dealership {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Tom", "123 Something St", 21000);
		
		Vehicle vehicle1 = new Vehicle("Kia", "Forte", 20000);
		
		Employee employee1 = new Employee();
		
		customer1.purchaseCar(vehicle1, employee1, false);
		
	}

}
