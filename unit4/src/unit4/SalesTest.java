package unit4;
import java.util.Scanner;

public class SalesTest {

	public static void main(String[] args) {
		
		
		int item1, item2, item3, item4;
		String divider = "\n**********\n";
		Scanner user = new Scanner(System.in);
		
		item1 = requestInput("Enter item1 sales: ", user);
		item2 = requestInput("Enter item2 sales: ", user);
		item3 = requestInput("Enter item3 sales: ", user);
		item4 = requestInput("Enter item4 sales: ", user);
		
		
		
		
		Sales s = new Sales(item1, item2, item3, item4);
		
		
		System.out.println("\nCatalog");
		System.out.println(divider);
		s.getItemPrices();
		System.out.println(divider);
		
		System.out.println("Total Items Sold: " + s.totalSold());
		System.out.println(divider);
		System.out.println("Earnings: " + s.getEarnings());
		
		
		

	}
	
	public static int requestInput(String a, Scanner user ) {
		System.out.println(a);
		return user.nextInt();
	}

}
