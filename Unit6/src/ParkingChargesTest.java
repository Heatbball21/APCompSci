import java.util.Scanner;

public class ParkingChargesTest {

	public static void main(String[] args) {
		calculateCharges c = new calculateCharges();
		calculateCharges d = new calculateCharges();
		calculateCharges e = new calculateCharges();
		Scanner s = new Scanner(System.in);
		
		
		double totalCharges = 0;
		double totalHours = 0;
		
		//c
		System.out.println("Enter your hours(person 1): ");
		c.hours = s.nextDouble();
		System.out.println("Charges: $" + c.checkHours());
		totalCharges += c.checkHours();
		if(c.hours <=24  && c.hours >0)totalHours += c.hours;
		System.out.println("Total Charges from yesterday: $" + totalCharges);
		
		//d
		System.out.println("Enter your hours(person 2): ");
		d.hours = s.nextDouble();
		System.out.println("Charges: $" + d.checkHours());
		totalCharges += d.checkHours();
		if(d.hours <=24  && d.hours >0)totalHours += d.hours;		
		System.out.println("Total Charges from yesterday: $" + totalCharges);
		
		//e
		System.out.println("Enter your hours(person 3): ");
		e.hours = s.nextDouble();
		System.out.println("Charges: $" + e.checkHours());
		totalCharges += e.checkHours();
		if(e.hours <=24 && e.hours >0)totalHours += e.hours;
		System.out.println("Total Charges from yesterday: $" + totalCharges + "\n\n");
		
		
		System.out.println("Total hours: " + totalHours + "\nTotal charges: $" + totalCharges);
		
		
		
		
		s.close();
	}

}
