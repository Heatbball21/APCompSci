package Airline;

import java.util.Scanner;

public class AirlineTest {

	public static void main(String[] args) {
		
		//create new scanner s, CheckSeating c
		Scanner s = new Scanner(System.in);
		CheckSeating c = new CheckSeating();
		
		//variables
		int choice; //users choice of 1 or 2
		boolean found = false; //boolean to check if a seat has been found each run
		int FirstClassCounter; //counter to iterate through the first class seats
		int EconomyCounter; //counter to iterate through the economy seats
		char move; //y or n to move seats
	
		//while loop that runs so long as one of the last seats in each class is open
		while(c.seating[4] == false || c.seating[9] == false) {
			
			//prints current seating
			c.getSeating();
			
			//get users seat choice
			choice = request("Enter 1 for First Class or 2 for Economy: ", s);
			
			found = false; //set found to false at the start of every run
			FirstClassCounter = 0; //set first class counter to 0 which is seat 1
			EconomyCounter = 5; //set economy counter to 5 which is seat 6
			
			//start logic
			if(choice == 1) {
				
				//while loop to run through each first class seat to check if it is taken or open
				while(found == false && FirstClassCounter <5) {
					found = c.CheckFirstClass(FirstClassCounter);
					FirstClassCounter++;
				}
				//after the loop if a seat still hasn't been found
				if(found == false) {
					System.out.println("No available seats in First Class, would you like to move? (y/n): ");
					move = s.next().charAt(0);
					if(move == 'y') {
						//if the user wants to move seats loop thought the economy seats
						while(found == false && EconomyCounter > 4 && EconomyCounter < 10) {
						found = c.CheckEconomy(EconomyCounter);
						EconomyCounter ++;
						}
							//if no seat has been found print no available seats
							if(found == false) {
								System.out.println("\nSorry no available seats.\n");
							}
							
					}else {
						System.out.println("\nNext flight leaves in 3 hours.\n");
					}
				}else {
					found = false;
				}
			//same as above for choice 1
			}else if(choice == 2) {
				
				while(found == false && EconomyCounter > 4 && EconomyCounter < 10) {
					found = c.CheckEconomy(EconomyCounter);
					EconomyCounter ++;
					}
				
				if(found == false) {
					System.out.println("No available seats in Economy, would you like to move? (y/n): ");
					move = s.next().charAt(0);
					
					if(move == 'y') {
						
						while(found == false && FirstClassCounter <5) {
							found = c.CheckFirstClass(FirstClassCounter);
							FirstClassCounter++;
						}
						if(found == false) {
							System.out.println("\nSorry no available seats.\n");
						}
					}else {
						System.out.println("\nNext flight leaves in 3 hours.\n");
					}
				}else {
					found = false;
				}
				
			//if 1 or 2 was not entered then give error
			}else {
				System.out.println("Error not a valid answer");
			}
			
		}
		c.getSeating();
		
	}
	
	//method to request user input
	public static int request(String str, Scanner s) {
		System.out.println(str);
		return s.nextInt();
	}

}
