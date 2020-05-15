package Practices;

import java.util.Scanner;

public class ConvertAnyNUmber {
    public static void main(String[] args) {
        // Declarations!!!

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number between 0 - 9 ");
        int number = input.nextInt();
        String result = "";

        //Instructions!!!

        switch (number) {
            case 0 :
                result = "Zero";
                break;
            case 1 :
                result = "One";
                break;
            case 2 :
                result = "Two";
                break;
            case 3 :
                result = "Three";
                break;
            case 4 :
                result = "Four";
                break;
            case 5 :
                result = "Five";
                break;
            case 6 :
                result = "Six";
                break;
            case 7 :
                result = "Seven";
                break;
            case 8 :
                result = "Eight";
                break;
            case 9 :
                result = "Nine";
                break;

            default:
                System.out.println("Invalid.");

        }
        System.out.print(result);
    }
}
