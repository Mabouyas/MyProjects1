package Progate_Dojo;
import java.util.*;
public class CarObject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bicycle bicycle = new Bicycle("Bianchi", "Green");
		System.out.println("[Bicycle Info]");
		bicycle.printData();
		System.out.println("-----------------");
		System.out.print("Enter distance to move:");
		
		int distanceBicycle = scanner.nextInt();
		bicycle.run(distanceBicycle);
		
		System.out.println("=================");
		
		Car car = new Car("Ferrari", "Red");
		System.out.println("[Car info]");
		car.printData();
		
		System.out.println("-----------------");
		System.out.print("Enter distance to move:");
		int distanceCar = scanner.nextInt();
		car.run(distanceCar);
		
	}
}
