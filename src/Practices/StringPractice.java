package Practices;

public class StringPractice {
	public static void main(String[] args) {
		String sentence = "Text processing is hard!";
		int position = sentence.indexOf("hard");
		System.out.println(sentence);
		System.out.println();
		System.out.println("The word \" hard \" start at index " + position);
		sentence = sentence.substring(0,position ) + "easy";
		sentence = (sentence.toUpperCase());
		System.out.println("The change string is: ");
		System.out.println(sentence);
	}
}
