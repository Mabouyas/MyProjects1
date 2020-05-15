package Practices;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(45);
		list.add(32);
		list.add(21);
		list.add(75);
		System.out.println("Number of elements in ArrayList: " + list.size());
	}
}
