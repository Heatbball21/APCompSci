
public class DiceCheck {
	/*
	 * A method that checks what the sum of the two die were and then adds 1 to the specified index
	 * 
	 * A method that returns the results of all the rolls
	 */
		
		
		//totals for sum       2 3 4 5 6 7 8 9 10 11 12
				int[] total = {0,0,0,0,0,0,0,0,0,0,0};
		
		public void checkRes(int num) {
			if(num == 2) {
				total[0] += 1;
			}else if(num == 3) {
				total[1] += 1;
			}else if(num == 4) {
				total[2] += 1;
			}else if(num == 5) {
				total[3] += 1;
			}else if(num == 6) {
				total[4] += 1;
			}else if(num == 7) {
				total[5] += 1;
			}else if(num == 8) {
				total[6] += 1;
			}else if(num == 9) {
				total[7] += 1;
			}else if(num == 10) {
				total[8] += 1;
			}else if(num == 11) {
				total[9] += 1;
			}else if(num == 12) {
				total[10] += 1;
			}
		}
		
		public void getResults() {
			for(int i = 0; i<total.length; i++) {
				System.out.println(i+2 + " : " + total[i]);
			}
			
			
		}
}
