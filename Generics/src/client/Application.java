package client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
//		Container<Integer, String> container = new Container<>(12, "hello");
//		int val = container.getItem1();
//		String val2 = container.getItem2();
//		
//		
//		Set<String> mySet1 = new HashSet<String>();
//		mySet1.add("Hello");
//		mySet1.add("World");
//		
//		Set<String> mySet2 = new HashSet<String>();
//		mySet1.add("Ciao");
//		mySet1.add("World");
//		mySet1.add("Everyone");
//		
//		Set<String> resultSet = union(mySet1, mySet2);
//		
//		Iterator<String> itr = resultSet.iterator();
//		while (itr.hasNext()) {
//			String var = itr.next();
//			System.out.println(var);
//		}
		
		
		
		
		Object myObj = new Object();
		String myVar = "hello";
		myObj = myVar;
		
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Accountant> accountants = new ArrayList<>();
		// employees = accountants;  -->  CAN'T DO THIS
		
		
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		employees2 = accountants2;
		
		
		// Upper bound --> Employee or lower (child classes)
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		employees3 = accountants3;
		
		
		// Lower bound --> Employee or higher (parent classes)
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		ArrayList<Accountant> accountants4 = new ArrayList<>();
		// employees4 = accountants4;  -->  CAN'T DO THIS
		
		

		employees.add(new Employee());
		accountants.add(new Accountant());
		makeEmployeeWork(employees);
		makeEmployeeWork(accountants);
		

	}
	
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
	}
	
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for (Employee emp : employees) {
			emp.work();
		}
	}
	

}
