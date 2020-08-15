
public class ExponentiationTest {

	public static void main(String[] args) {
		
		integerPower p = new integerPower();
		
		for(int i = 2; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.println("B: " + i + "|| E: " + j + " = " + p.exponent(i, j));
				
			}
		}
		
		

	}

}
