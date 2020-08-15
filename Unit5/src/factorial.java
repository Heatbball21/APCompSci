
import java.util.HashMap;


public class factorial {

	long factorialResult = 1;
	HashMap<Integer, Long> mem = new HashMap<Integer, Long>();
	
	
	public static void main(String[] args) {
		factorial f = new factorial();
		
		for(int i = 1; i<21; i++) {
			System.out.println(f.fact(i));
			
			
			
		}
		
		System.out.println("\n*******************************\n");
		
		System.out.println("Memoization HashMap where key=n and value=factorialResult: ");
		f.getHash();
		

	}
	
	public long fact(int n) {
		
		
		if(n == 1 || n == 0) {
			return factorialResult = 1;
		}else if(mem.containsKey(n)){
			return factorialResult = mem.get(n);
			
		}else {
			mem.put(n, factorialResult);
			return factorialResult =  n * fact(n-1);
			
		}
		
		
	}
	
	public void getHash() {
		System.out.println(mem);
	}

}
