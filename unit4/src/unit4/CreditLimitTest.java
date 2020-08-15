package unit4;
import java.util.Scanner;

public class CreditLimitTest {

	public static void main(String[] args) {
		

		int account, startBalance, totalItems, creditsApplied, allowedCredits;
		
	
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter account number: ");
		account = s.nextInt();
		System.out.println("Enter start balance: ");
		startBalance = s.nextInt();
		System.out.println("Enter total charges: ");
		totalItems = s.nextInt();
		System.out.println("Enter credits applied: ");
		creditsApplied = s.nextInt();
		System.out.println("Enter allowed credits: ");
		allowedCredits = s.nextInt();
		
		
		CreditLimit c = new CreditLimit(account, startBalance, totalItems, creditsApplied, allowedCredits);
		
		System.out.println("New Balance: " + c.getNewBalance());
		c.checkBalance();
		
		
		
		s.close();
	}

}
