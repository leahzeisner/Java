package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the state of feeling certain about the truth of something.");
		
//		for (String word : dictionary.keySet()) {
//			System.out.print(word + ": ");
//			System.out.println(dictionary.get(word));
//		}
		
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			System.out.println(entry.getValue());
		}
		
		System.out.println("");
		
		
		
		// sorts keys in natural order
		TreeMap<String, String> treeMap = new TreeMap<String, String>(dictionary);
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			System.out.println(entry.getValue());
		}

	}

}
