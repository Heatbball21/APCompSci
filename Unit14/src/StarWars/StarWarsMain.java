package StarWars;

import java.util.Scanner;

public class StarWarsMain {

	public static void main(String[] args) {
		String first, last, maiden, city, car, medication;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		first = s.next();
		System.out.println("Enter last name: ");
		last = s.next();
		System.out.println("Enter mother's maiden name: ");
		maiden = s.next();
		System.out.println("Enter city of birth: ");
		city = s.next();
		System.out.println("Enter first car name: ");
		car = s.next();
		System.out.println("Enter last medication taken: ");
		medication = s.next();
		
		generateName(first, last, maiden, city, car, medication);
		s.close();
	}
	
	public static void generateName(String first, String last, String maiden, String city, String car, String medication) {
		
		System.out.println("------------------------------");
		System.out.println(first.substring(0, 3) + last.substring(0, 2) + " " + maiden.substring(0, 2) + city.substring(0, 3));
		char[] lastChar = last.toCharArray();
		String revLast = "";
		
		for(int j = lastChar.length -1; j >= 0; j--) {
			revLast += (lastChar[j]);
		}
		
		System.out.println(revLast.substring(0, 3) + car + " of " + medication);
	}

}
