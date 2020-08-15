package ReverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayMain {

	static String user;
	static char[] chars;
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your phrase: ");
		user = s.nextLine();
		
		chars = user.toCharArray();
		
		
		System.out.println(reverse(chars));
		
	}
	
	public static String reverse(char[] chars) {
		
		
		if(chars.length > 0) {
			return chars[chars.length -1] + reverse(Arrays.copyOfRange(chars, 0, chars.length-1));
		}
		
		return "";
	}

}
