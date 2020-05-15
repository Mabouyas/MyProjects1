package Practices;

import java.util.Scanner;

public class Calorie
{
	public static void main(String[] args)
	{
		int minutes = 30,hours = 360;
		int runMETS = 10 * minutes;
		int basketMETS = 8 * minutes;
		int sleepMETS = 1 * hours;
		double calRunBurned;
		double calBaskBurned;
		double calSleepBurned;
		double weight;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds:");
		weight = scan.nextDouble();
		 calRunBurned = (0.0175 * (weight / 2.2)) * runMETS;
		calBaskBurned = (0.0175 * (weight / 2.2)) * basketMETS;
		calSleepBurned = (0.0175 * (weight / 2.2)) * sleepMETS;
		double cal = calBaskBurned + calRunBurned + calSleepBurned;
		System.out.println("Running Calories Burned:" + (int)cal);
		
		
	}
}
