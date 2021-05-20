package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Vehicle v = new Vehicle("Toyota", "Camery", 15000, false);
		
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		vehicles.add(v);
		
//		for (Vehicle vehicle : vehicles) {
//			System.out.println(vehicle);
//		}
		
		printElements(vehicles);

	}
	
	public static void printElements(List someList) {
		
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}
