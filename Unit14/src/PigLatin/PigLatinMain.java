package PigLatin;

import java.util.Scanner;

public class PigLatinMain {

	static String phrase;
	static String[] words;	
	static String word;
	static String cont = "yes";
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		while(cont == "yes") {
			System.out.println("Enter your phrase: ");
			phrase = s.nextLine();
		
			
			words = phrase.split(" ");
			for(String a : words) {
				System.out.println(a);
				printLatinWord(a);
			}
			
			
		}
	
	}
	
	public static void printLatinWord(String a) {
		
		
			word = a.substring(1) + a.substring(0, 1) + "ay \n";
			
			System.out.print(word);
			word = "";
		
	}

}
