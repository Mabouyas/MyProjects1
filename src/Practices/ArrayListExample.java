package Practices;

import java.util.*;

/*
 * This example demonstrates how to create, initialize, add and remove elements from ArrayList.
 * In this example we have an ArrayList of type “String”.
 * We have added 5 String element in the ArrayList using the method add(String E),
 * this method adds the element at the end of the ArrayList.
 * We are then adding two more elements in the ArrayList using method add(int index, String E),
 * this method adds the specified element at the specified index, index 0 indicates first position and 1 indicates second position.
 * We are then removing the elements “Chaitanya” and “Harry” from the ArrayList and then we are removing the second element of the ArrayList using method remove(int index).
 * Since we have specified the index as 1 (remove(1)), it would remove the second element.
 */
public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<>();
		
		obj.add("Steve");
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Anuj");
		
		System.out.println("Original Arraylist:");
		for (String str:obj)
			System.out.println(str);
		
		
		obj.add(0,"Chauvet");
		obj.add(1,"Justin");
		
		
		System.out.println("Arraylist after add:");
		for (String str:obj)
			System.out.println(str);
		
		
		obj.remove("Chaitanya");
		obj.remove("Harry");
		
		
		System.out.println("ArrayList after remove:");
		for (String str:obj)
			System.out.println(str);
		
		
		obj.remove(1);
		System.out.println("Final Arraylist:");
		for (String str:obj)
			System.out.println(str);
		
		
	}
}
