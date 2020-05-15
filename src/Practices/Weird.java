package Practices;

import java.util.Scanner;

public class Weird {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		String result = "";
		int N = scan.nextInt();
		
		if (N > 1 && N < 100)
		{
			if (N % 2 != 0) result = "Weird";
			else if (N >= 2 && N <= 5) result = "Not Weird";
			else if (N >= 6 && N <=20) result = "Weird";
			else result = "Not Weird";
		}
		else
		result = "Not Weird";
		System.out.println(result);
		
		
		
		
		
	}
}
