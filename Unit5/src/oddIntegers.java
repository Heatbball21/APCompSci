
public class oddIntegers {
	
	public static int product = 1;
	

	public static void main(String[] args) {
		
		
		int[] set = {1, 3, 5, 7, 9, 11, 13, 15};
		
		for(int i = 0; i<set.length; i++) {
			product *= set[i];
		}
		
		System.out.println(product);

	}

}
