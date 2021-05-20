package lesson1;
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList words = new ArrayList();
		
		words.add("Hello");
		words.add("World");
		
		words.remove(0);
		
		words.add(9);
		words.add(18.3);
		
		words.add('H');
		
		double var = (double) words.get(2);
		char var2 = (char) words.get(3);
		
		Object var3 = words.get(0);
		
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		
		
		
		
		ArrayList<String> words2 = new ArrayList<String>();
		
		words2.add("Hello");
		words2.add("World");
		
		String word1 = words2.get(0);
		String word2 = words2.get(1);
		
		System.out.println(word1);
		System.out.println(word2);
		
		
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(4);
		
		for (int num : numbers) {
			System.out.println(num);
		}

	}

}
