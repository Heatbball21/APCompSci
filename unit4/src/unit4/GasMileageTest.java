package unit4;
import java.util.Scanner;

public class GasMileageTest {

	public static void main(String[] args) {
		
		int miles;
		int gallons;
		
		char cont = 'y';
		
		Scanner s = new Scanner(System.in);
		GasMileage g = new GasMileage();
		
		while(cont != 'n') {
			
			System.out.println("Enter miles driven: ");
			miles = s.nextInt();
			System.out.println("Enter gallons used: ");
			gallons = s.nextInt();
			
			System.out.println("MPG from trip: ");
			System.out.println(g.getTrip(miles, gallons));
			
			System.out.println("Enter another trip (y/n): ");
			cont = s.next().charAt(0);
			
			
			
		}
		System.out.println("Total miles driven: ");
		System.out.println(g.getMiles());
		System.out.println("Total gallons used: ");
		System.out.println(g.getGallons());
		
		System.out.println("Total MPG: ");
		System.out.println(g.getTotal());
		
		s.close();
		

	}

}
