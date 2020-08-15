import java.util.Random;

public class DiceRoll {
	//Two methods that simulate a dice roll for Dice1 and Dice2
	
	
		int dice1, dice2;
		Random r = new Random();
		
		
		public int getDice1() {
			dice1 = r.nextInt(7);
			return this.dice1;
		}
		public int getDice2() {
			dice2 = r.nextInt(7);
			return this.dice2;
		}
		
}
