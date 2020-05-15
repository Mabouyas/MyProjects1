package Practices;
/*
ask the user for his name, capture it on a string using scanner.

then output the length of the name string.
 */
import java.util.Scanner;

public class Saturday1Practice {
    public static void main(String[] args) {
        // Declarations!!!

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = s.nextLine();
        int lName = name.length();

        System.out.println("Length of " + name + " is " + lName);
    }
}
