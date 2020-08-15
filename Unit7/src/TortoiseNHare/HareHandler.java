package TortoiseNHare;

import java.util.Random;

public class HareHandler {

	
	String[] harePos = new String[70];
	Random r = new Random();
	int currentPos = 0;
	int prevPos = 0;
	int num;
	
	public void createPos() {
		for(int i = 0; i < harePos.length; i++) {
			harePos[i] = "_";
		}
		harePos[0] = "|";
	}
	
	public void turn() {
		
		num = r.nextInt(10) + 1;
		
		if(num == 1 || num == 2) { //add 70 handler
			
			if(currentPos+0 > 69) {
				prevPos = currentPos;
				harePos[prevPos] = "_";
				currentPos = 69;
				harePos[currentPos] = "|";
			}else {
			
			prevPos = currentPos;
			harePos[prevPos] = "_";
			currentPos += 0;
			harePos[currentPos] = "|";
			
			displayMove();
			}
		}else if(num == 3 || num == 4) { //add 70 handler
			
			if(currentPos+9 > 69) {
				prevPos = currentPos;
				harePos[prevPos] = "_";
				currentPos = 69;
				harePos[currentPos] = "|";
			}else {
			
			prevPos = currentPos;
			harePos[prevPos] = "_";
			currentPos += 9;
			harePos[currentPos] = "|";
			
			displayMove();
			}
		}else if(num == 5) {  // add 0 handler
			
			if(currentPos < 12) {
				prevPos = currentPos;
				harePos[prevPos] = "_";
				currentPos = 0;
				harePos[currentPos] = "|";
			}else {
			
			prevPos = currentPos;
			harePos[prevPos] = "_";
			currentPos -= 12;
			harePos[currentPos] = "|";
			}
			displayMove();
		}else if(num >= 6 && num <= 8) { //add 70 handler
			
			if(currentPos+1 > 69) {
				prevPos = currentPos;
				harePos[prevPos] = "_";
				currentPos = 69;
				harePos[currentPos] = "|";
			}else {
			
			prevPos = currentPos;
			harePos[prevPos] = "_";
			currentPos += 1;
			harePos[currentPos] = "|";
			
			displayMove();
			}
		}else if(num == 9 || num == 10) { //add 0 handler
			
			if(currentPos < 2) {
				prevPos = currentPos;
				harePos[prevPos] = "_";
				currentPos = 0;
				harePos[currentPos] = "|";
			}else {
			
			prevPos = currentPos;
			harePos[prevPos] = "_";
			currentPos -= 2;
			harePos[currentPos] = "|";
			}
			displayMove();
		}else {
			System.out.println("Error");
		}
		
	}
	
	public void displayMove() {
		System.out.print("Hare: ");
		for(int i = 0; i < harePos.length; i++) {
			
			System.out.print(harePos[i]);
		}
		System.out.println(currentPos + 1);
		System.out.println("\n");
	}
	
	
	
	
}
