package Progate_Dojo;
/*
Welcome to Java Dojo II!
In this course, we are going to make a program using two types of objects: Bicycle and Car.
Let's look at what we are going to make by clicking on the ▶ in the Expected Result console.
This program receives the following inputs from the console:
・The distance you ride the bicycle (Integer)
・The distance you drive the car (Integer)
・The amount of fuel you refuel（Integer）
Enter some value whenever Enter ____:  is shown on the console.
 */

public class Bicycle {
	
		private String name;
		private String color;
		private int distance = 0;
		
		
		Bicycle(String name, String color) {
			this.name = name;
			this.color = color;
		}
		
		public void printData() {
			System.out.println("Name: " + this.name);
			System.out.println("Color: " + this.color);
			System.out.println("Distance: " + this.distance + "km");
		}
		
		
		public void run(int distance) {
			System.out.println("Moving " + distance + "km ...");
			this.distance += distance;
			System.out.println("Distance: " + this.distance + "km");
		}
	}

