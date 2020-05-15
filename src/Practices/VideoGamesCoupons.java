package Practices;

import java.util.*;

public class VideoGamesCoupons {

        public static void main(String[] args) {
            //Declarations.


            Scanner input = new Scanner(System.in);
            System.out.println("Enter number of coupons:");
            int coupons = input.nextInt();
            int candy = coupons / 10;
            int gumball = ((coupons % 10) / 3);
            //Instructions.

            if (coupons > 3) {
                System.out.println("Number of Candies: " +candy );
                System.out.println("Number of Gumballs: " +gumball );
            }
            else
            {
                System.out.println("Not enough coupons");
            }
        }
    }

