package Airline;

public class CheckSeating {

	
	//seating array
	boolean[] seating = {false, false, false, false, false, false, false, false, false, false};
	BoardingPass b = new BoardingPass();
	
	//check first class seating 0-4
	public boolean CheckFirstClass(int i) {
	//if the seat at the value of FirstClassCounter is false then change it to true and return true to end while loop by setting found = true
		if(this.seating[i] == false) {
			this.seating[i] = true;
			b.printBoardingPass(i+1, "First Class");
			return true;
		}else {
			return false;
		}
		
	}
	//check economy seating 5-9
	public boolean CheckEconomy(int i) {
	//if the seat at the value of EconomyCounter is false then change it to true and return true to end while loop by setting found = true
		if(this.seating[i] == false) {
			this.seating[i] = true;
			b.printBoardingPass(i+1, "Economy");
			return true;
		}else {
			return false;
		}
		
	}

	//print out seating 
	public void getSeating() {
		System.out.println("First Class |" + " Economy");
		for(int i = 0; i<5; i++) {
			
			if(seating[i] == false) {
				if(seating[i+5] == false) {
					System.out.println("Open" + "           Open");
				}else {
					System.out.println("Open" + "           Taken");
				}
			}else if(seating[i] == true) {
				if(seating[i+5] == false) {
					System.out.println("Taken" + "          Open");
				}else {
					System.out.println("Taken" + "          Taken");
				}
			}
			
			
		}
	}
}
