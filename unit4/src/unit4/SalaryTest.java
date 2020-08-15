package unit4;
import java.util.Scanner;

public class SalaryTest {

	public static void main(String[] args) {
		
		double pay, hoursWorked;
		String divider = "\n*********\n";

		Scanner user = new Scanner(System.in);
		
		pay = requestInput("Enter hourly pay rate: ", user);
		hoursWorked = requestInput("Enter hours worked: ", user);
		
		Salary s = new Salary(pay, hoursWorked);
		
		System.out.println(divider);
		
		System.out.println(s.getHoursWorked() + " total hours worked @ $" + s.getPay() + "/hr with " + s.getOvertime() + " hours of overtime");
		System.out.println(divider);
		
		System.out.println("Salary: $" + s.getSalary());
		
		
	}
	
	
	public static int requestInput(String a, Scanner user ) {
		System.out.println(a);
		return user.nextInt();
	}

}
