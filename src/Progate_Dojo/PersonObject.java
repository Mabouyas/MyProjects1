package Progate_Dojo;

import java.util.Scanner;

public class PersonObject
{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of people:");
		int number = scanner.nextInt();
		
		int maxAge = 0;
		int totalAge = 0;
		int personNumber = 0;
		for (int i = 0; i < number; i++){
			personNumber = i + 1;
			System.out.println("Person number " + personNumber);
			
			System.out.print("First name: ");
			String firstName = scanner.next();
			
			System.out.print("Last name: ");
			String lastName = scanner.next();
			
			System.out.print("Age: ");
			int age = scanner.nextInt();
			
			if(age > maxAge)
			{
				maxAge = age;
			}
			totalAge += age;
			System.out.print("Height (m): ");
			double height = scanner.nextDouble();
			
			System.out.print("Weight (kg): ");
			double weight = scanner.nextDouble();
			
			Person.printData(firstName, lastName, age, height, weight);
		}
		System.out.println("Age of oldest person: " + maxAge + ".");
		System.out.println("Average age: " + totalAge / number + ".");
	}
	
}
