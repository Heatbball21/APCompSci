package Palindromes;


import java.util.Scanner;

	

public class PalindromesMain {

	static String input;
	static String user;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter your phrase or word: ");
		user = s.nextLine();
		
		input = user.replaceAll("\\s", "");
		
		System.out.println(isPalindrome(input));

	}
	
	public static boolean isPalindrome(String input) {
		
	if(input.length() == 1) {
		return true;
	}
	if(input.length() == 2) {
		if(input.charAt(0) == input.charAt(1)) {
			return true;
		}
	}
	return input.charAt(0) == input.charAt(input.length() - 1) && isPalindrome(input.substring(1, input.length() - 1));
		
	}

}
