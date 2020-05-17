package Progate_Dojo;

import java.util.Scanner;

public class BicycleObject {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bicycle bicycle = new Bicycle("Bianchi", "Green");
		System.out.println("[Bicycle Info]");
		bicycle.printData();
		System.out.println("-----------------");
		System.out.print("Enter distance to move:");
		
		int distanceBicycle = scanner.nextInt();
		bicycle.run(distanceBicycle);
	}
}