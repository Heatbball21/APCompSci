package TortoiseNHare;

import java.util.Random;

public class TortoiseHandler {

	
	String[] tortoisePos = new String[70];
	Random r = new Random(10);
	int num;
	int prevPos;
	int currentPos;
	
	public void createPos() {
		for(int i = 0; i < tortoisePos.length; i++) {
			tortoisePos[i] = "_";
		}
		tortoisePos[0] = "|";
	}
	
	public void turn() {
		
		num = r.nextInt(10) + 1;
		
		if(num >= 1 && num <= 5) { // add 70 handler
			
			if(currentPos+3 > 69) {
				prevPos = currentPos;
				tortoisePos[prevPos] = "_";
				currentPos = 69;
				tortoisePos[currentPos] = "|";
			}else {
			
			prevPos = currentPos;
			tortoisePos[prevPos] = "_";
			currentPos += 3;
			tortoisePos[currentPos] = "|";
			
			displayMove();
			}
		}else if(num == 6 || num == 7) { // add 0 handler
			
			if(currentPos < 6) {
				prevPos = currentPos;
				tortoisePos[prevPos] = "_";
				currentPos = 0;
				tortoisePos[currentPos] = "|";
			}else {
			prevPos = currentPos;
			tortoisePos[prevPos] = "_";
			currentPos -= 6;
			tortoisePos[currentPos] = "|";
			}
			displayMove();
		}else if(num >= 7 && num <= 10) { // add 70 handler
			
			if(currentPos+1 > 69) {
				prevPos = currentPos;
				tortoisePos[prevPos] = "_";
				currentPos = 69;
				tortoisePos[currentPos] = "|";
			}else {
			
			prevPos = currentPos;
			tortoisePos[prevPos] = "_";
			currentPos += 1;
			tortoisePos[currentPos] = "|";
			displayMove();
			}
		}else {
			System.out.println("Error");
		}
		
	}
	
	public void displayMove() {
		System.out.print("Tortoise: ");
		for(int i = 0; i < tortoisePos.length; i++) {
			
			System.out.print(tortoisePos[i]);
		}
		System.out.println(currentPos + 1);
		System.out.println("\n");
	}
	
}
