package Practices;

import java.util.Scanner;
import java.util.Arrays;

/*
Enter the number of items: 5
Enter the value of all items (separated by space): 7 9 1 6 2
The values are: [7, 9, 1, 6, 2]
 */
public class ReadPrintArray
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int numItems;
		int[] items = new int[0];
		
		
		System.out.println("Enter the number of items:");
		numItems = scan.nextInt();
		
		items = new int[numItems];
		
		
		if (items.length > 0)
		{
			System.out.println("Enter the value of all items (separated by space):");
		
			for (int j = 0; j < items.length; j++) {
				items[j] = scan.nextInt();
			}
		}
		
		System.out.println("The values ares:");
		for (int i = 0; i < items.length; i++)
		{
			items[i] += i + 1;
			System.out.println(items[1]);
		}
		
	
	
	}
}
