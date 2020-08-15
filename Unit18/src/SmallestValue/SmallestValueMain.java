package SmallestValue;

import java.util.Scanner;

public class SmallestValueMain {

	
	static int[] ints = new int[5];
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 integer values one at a time: ");
		
		for(int i = 0; i < 5; i++) {
			ints[i] = s.nextInt();
		}
		System.out.println(findSmallest(ints, ints.length));
	}
	
	
	public static int findSmallest(int[] arr, int n) {
		if(n == 1) {
			return arr[0];
		}
		return Math.min(arr[n-1], findSmallest(arr, n-1));
	}

}
