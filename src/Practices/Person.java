package Practices;

class Person {
	public String name;
	Person(String name) {
		System.out.println("Created an instance of the Person class.");
		this.name = name;
	}
	public void hello() {
		System.out.println("Hey, I'm " + this.name);
	}
}
