package Practices;

import java.util.Scanner;

/*
Write a program that will print out information about the user based on email. Print first and last name from the email with the upper case. (Assume that first and last names were separated by an underscore)

 */
public class FridayPractice {
    public static void main(String[] args) {
        // Declarations!!!
        String firstName,firstChar,lastName,lastChar,Domain,TopLevelDomain;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email, and then press enter :");
        String email = scan.next();

        //Instructions!!!

                firstName = email.substring(0,email.indexOf("_"));
                firstChar = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

                lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
                lastChar = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

                Domain = email.substring(email.indexOf("@") +1,email.indexOf("."));
                TopLevelDomain = email.substring(email.indexOf(".")+1);


        System.out.println("Your email is : " + email);
        System.out.println("Your first name is : " + firstName + " become: " + firstChar);
        System.out.println("Your last name is : " + lastName + " become: " + lastChar);
        System.out.println("Your domain is : " + Domain);
        System.out.println("Your level domain is : " + TopLevelDomain);

    }
}
