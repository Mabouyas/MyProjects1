package Practices;

import java.util.Scanner;

/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts;
Declare 2 int variables: age, zip-code
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

 */
public class PatientInfo {
    public static void main(String[] args) {
        //Declarations!!!

        String firstName,lastName,fullName,email,street,state,city,address;
        String contacts = "";
        int age,zipCode;
        double height,weight;
        boolean isMarried;
        long workPhNumber,personalPhNumber;

        Scanner scan = new Scanner(System.in);

        //Instructions!!!

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        firstName = scan.nextLine();
        System.out.println("Enter your last name");
                lastName = scan.nextLine();

                        fullName = firstName.concat(lastName);

        System.out.println("Enter your work phone");
                workPhNumber = scan.nextLong();
                contacts += workPhNumber;
        System.out.println("Enter your personal phone number");
                personalPhNumber = scan.nextLong();
                contacts += personalPhNumber;
        System.out.println("enter you email");
                email = scan.next();
                contacts += email;



        System.out.println("Enter your street");
                street = scan.nextLine();
                scan.nextLine();
        System.out.println("Enter your city");
                city = scan.next();
                scan.nextLine();
        System.out.println("Enter your state");
                state = scan.next();
                scan.nextLine();
        System.out.println("Enter your zip code");
                zipCode = scan.nextInt();
                address = street.concat(city).concat(state).concat(zipCode+"");


        System.out.println("Enter your age");
                age = scan.nextInt();
        System.out.println("Enter your height");
                height = scan.nextDouble();
        System.out.println("Enter your weight");
                weight = scan.nextDouble();
        System.out.println("Are you married?");
                isMarried = scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: "+ fullName);
        System.out.println("Address: "+ address);
        System.out.println("Contacts: "+ contacts);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height);
        System.out.println("Weight: "+ weight);
        System.out.println("Married?: "+ isMarried);






    }
}
