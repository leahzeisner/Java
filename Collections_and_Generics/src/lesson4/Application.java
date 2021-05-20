package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(109);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(54);
		
//		list1.addAll(list2);
//		System.out.println(list1);
//		
//		list1.removeAll(list2);	
//		System.out.println(list1);
//		
//		System.out.println(list1.contains(43));
//		
//		list1.addAll(list2);
//		list1.retainAll(list2);
//		System.out.println(list1);
//		
//		list1.clear();
//		System.out.println(list1);
//		System.out.println(list1.isEmpty());
		
		
//		List<Integer> newList = new ArrayList<Integer>(list1);
//		System.out.println(newList);
		
		
		
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(new Employee("Amy", 35000, "Accounting"));
		set.add(new Employee("Leah", 100000, "Web Dev"));
		set.add(new Employee("Jane", 40000, "Sales"));
		set.add(new Employee("Pam", 30000, "Reception"));
		
		ArrayList<Employee> setArray = new ArrayList<Employee>(set);
		
		Collections.sort(setArray);
		System.out.println(setArray);
		

		
		

	}

}
