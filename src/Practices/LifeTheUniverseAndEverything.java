package Practices;

import java.util.Scanner;

public class LifeTheUniverseAndEverything
{
	public static void main(String[] args)
	{
		int num;
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			
			num = scan.nextInt();
			if (num != 42)
				
				System.out.println(num);
			else
				
				System.exit(0);
			
		}
	}
}
