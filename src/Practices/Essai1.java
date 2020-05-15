package Practices;
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.
 */
import java.util.*;
public class Essai1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// your code
		// ------------------------------------------
		String guestlist = "";
		while (true) {
			System.out.println("Please enter guest name:");
			String guestName = input.nextLine();
			guestlist += ", "+guestName;
			System.out.println("Do you want to enter new guest name:");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				continue;
			} else if (answer.equalsIgnoreCase("no")) {
				System.out.println("Guest's list: " + guestlist.substring(2,guestlist.length()));
				System.exit(0);
			}
		}
	}
}