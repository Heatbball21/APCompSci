
public class integerPower {

	long total = 1;
	public long exponent(int base, int exp) {
		total = 1;
		for(int i = 1; i<=exp; i++) {
			
			total *= base;
		}
		
		return total;
	}
	
}
