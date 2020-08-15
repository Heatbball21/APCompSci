import java.util.Scanner;
public class smallestValueTest {

	
	public static int size;
	public static float[] set;
	public static Scanner scan;
	public static float smallest;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		
		System.out.println("How many numbers would you like to add?: ");
		size = scan.nextInt();
		
		set = new float[size];
		
		for(int i = 0; i<set.length; i++) {
			
			System.out.println("Enter a number: ");
			set[i] = scan.nextInt();
			
		}
		
		
		for(int j = 0; j<set.length; j++) {
			
			smallest = set[0];
			
			if(set[j] < smallest) {
				smallest = set[j];
			}
			
		}
		
		System.out.println(smallest);

	}

}
