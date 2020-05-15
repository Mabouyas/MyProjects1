package MorgageProjects;

import java.util.Scanner;

public class ReadNumber_Principal {
    public static void main(String[] args) {
        int principal = (int)readNumber("Principal: ",1000,100_000);
    
    }
    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between:" + min + " and " + max);
        }
        return value;
    }
}