package Collections_Collection_Collector;

import java.util.ArrayList;
import java.util.Collection;

public class E1CollectionEx {
	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();

		// Adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.addAll(fruits); //to add same elements once more
		
		// printing collection elements
		System.out.println(fruits); // [Apple, Banana, Mango]
		 
		// Checking if "Banana" exists
		System.out.println("Contains Banana? " + fruits.contains("Banana")); //*/

		// Iterating through elements
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
