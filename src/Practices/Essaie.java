package Practices;
import java.util.Scanner;
public class Essaie {
	public static void main(String[] args) {
		
		
		int count = 0;
		int lastIndex = 0;
		String findStr = "hello";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("string");
		String str = scan.nextLine();
		
		while (lastIndex != -1)
		{
			lastIndex = str.lastIndexOf(findStr,lastIndex);
			if (lastIndex != -1)
			{
				count++;
				lastIndex += findStr.length();
			}
		}
				
				
		System.out.println(count);
	}
}
