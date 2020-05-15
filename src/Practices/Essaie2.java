package Practices;
/*
A variable inhabitants represents a city and its respective populations.
City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
After each day, a city will lose half of its population.
write a program to loop the city population and make it lose half of its population until no humans left.
Print the each day like below for each day:
 */
import java.util.*;
public class Essaie2 {
	public static void main(String[] args) {
		int[] day ={0};
		Scanner scan = new Scanner(System.in);
		System.out.print("inhabitants is ");
		int inhabitants = scan.nextInt();
		
		for (int i = 0; i < inhabitants ; i++) {
			System.out.println("day " + i );
			for (int j = inhabitants; j < inhabitants ; j--)
				inhabitants /= 2;
				System.out.println(day[inhabitants]);
		}
	}
}
