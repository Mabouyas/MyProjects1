package Practices;

public class Array_Essai {
	public static void main(String[] args) {
		int[] numbers = {8, 2, 6, 4, 3};
		int sum = 0, sumSq = 0;
		
		for (int eachNumber : numbers)
		{
			sum += eachNumber;
			sumSq += eachNumber * eachNumber;
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The square is: " + sumSq);
		
	}
}
