package unit4;

public class CreditLimit {

	
	int account;
	int startBalance;
	int totalItems;
	int creditsApplied;
	int allowedCredits;
	
	public CreditLimit(int account, int startBalance, int totalItems, int creditsApplied, int allowedCredits) {
		this.account = account;
		this.startBalance = startBalance;
		this.totalItems = totalItems;
		this.creditsApplied = creditsApplied;
		this.allowedCredits = allowedCredits;
	}
	
	
	public double getNewBalance() {
		return (startBalance + totalItems - allowedCredits);
	}
	
	public void checkBalance() {
		if(getNewBalance() > this.allowedCredits) {
			System.out.println("credit limit exceeded!");
		}
	}
 
	
	
}
