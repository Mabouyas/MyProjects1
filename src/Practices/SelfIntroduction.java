package Practices;

public class SelfIntroduction {
	public static void main(String[] args) {
		// Pass "doctor" as the job
		Person1 person1 = new Person1("Kate", "Jones", 27, 1.6, 50.0, "doctor");
		person1.printData();
		// Pass "teacher" as the job
		Person1 person2 = new Person1("John", "Christopher", "Smith", 65, 1.75, 80.0, "teacher");
		person2.printData();
		System.out.println("----------------------");
		// Change the job of person1 to "veterinarian"
		person1.setJob("veterinarian");
		
		// Output "Changed the job of person1 to ________."
		System.out.println("Changed the job of person1 to " + person1.getJob() + ".");
		
		person1.printData();
	}
}
