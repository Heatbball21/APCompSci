
public class DiceTest {

	public static void main(String[] args) {
		

		int iterations = 36000000;
		DiceRoll d = new DiceRoll();
		DiceCheck c = new DiceCheck();
		int sum;
		
		for (int i = 0; i<iterations; i++) {
			sum = d.getDice1() + d.getDice2();
			c.checkRes(sum);
		}

		c.getResults();
		
	}

}
