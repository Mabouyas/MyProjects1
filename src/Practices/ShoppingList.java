package Practices;


import java.util.*;

/*
In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3



public class ShoppingList {
    public static void main(String[] args) {
        // Declarations!!!
        String item1,item2,item3,report;
        double price1,price2,price3,totalPrice;
        int count1,count2,count3;
        Scanner scan = new Scanner(System.in);

        // Instructions!!
        System.out.println("Enter item1:");
        item1 = scan.next();
        System.out.println("Enter count1:");
        count1 = scan.nextInt();
        System.out.println("Enter price1:");
        price1 = scan.nextDouble();

        System.out.println("\nEnter item2:");
        item2 = scan.next();
        System.out.println("Enter count2:");
        count2 = scan.nextInt();
        System.out.println("Enter price2:");
        price2 = scan.nextDouble();

        System.out.println("\nEnter item3:");
        item3 = scan.next();
        System.out.println("Enter count3:");
        count3 = scan.nextInt();
        System.out.println("Enter price3:");
        price3 = scan.nextDouble();

        double item1Cost = price1 * count1;
        double item2Cost = price2 * count2;
        double item3Cost = price3 * count3;

        totalPrice =item1Cost + item2Cost + item3Cost;

        String report1 = "Item1: total price:" + item1Cost;
        String report2 = "Item2: total price:" + item2Cost;
        String report3 = "Item3: total price:" + item3Cost;
        System.out.println();

        if (count1 > 0)
            System.out.println(report1);
        if (count2 > 0)
            System.out.println(report2);
        if (count3 > 0)
            System.out.println(report3);

        System.out.println();
        System.out.println("Total cost is: " + totalPrice);

    }
}

*/

import java.util.*;

public class ShoppingList {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        // Declarations!!!
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;
        Scanner scan = new Scanner(System.in);

        // Instructions!!
        System.out.println("Enter item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

        double item1Cost = price1 * count1;
        double item2Cost = price2 * count2;
        double item3Cost = price3 * count3;

        totalPrice = item1Cost + item2Cost + item3Cost;

        String report0 = "";
        String report1 = "";
        String report2 = "";
        String report3 = "";
    
    
        countReport(item1, item2, item3, totalPrice, count1, count2, count3, item1Cost, item2Cost, item3Cost, report1, report2, report3);
    
    
    }
    
    private static void countReport(String item1, String item2, String item3, double totalPrice, int count1, int count2, int count3, double item1Cost, double item2Cost, double item3Cost, String report1, String report2, String report3) {
        String report0;
        if (count1 > 0)
            report1 = "Item1:" + item1 + " Price:" + item1Cost;
        
        
        if (count2 > 0)
            report2 = "Item2:" + item2 + " Price:" + item2Cost;
        
        
        if (count3 > 0)
            report3 = "Item3:" + item3 + " Price:" + item3Cost;
        
        report0 = (report1 + report2 + report3);
        System.out.println(report0);
        
        System.out.println("Total price:" + totalPrice);
    }
}
