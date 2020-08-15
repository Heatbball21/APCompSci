
public class calculateCharges {

	double hours;
	
	public double checkHours() {
		if(Math.ceil(hours) > 0) {
			if(Math.ceil(hours) <= 24) {
				if(Math.ceil(hours) <= 3) {
					return 2.00;
				}else if(hours >= 16 && Math.ceil(hours) <= 24) {
					return 10.00;
				}else {
				
					return ((Math.ceil(hours)-3)*.5) + 2.00;
			
				}
			}else {
				System.out.println("TO MANY HOURS");
				return 0.00;
		}
		
		}else {
			System.out.println("HOURS CAN'T BE LESS THAN OR EQUAL TO 0");
			
			return 0.00;		
		}
	}
	
	
}
