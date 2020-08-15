
public class BasePlusEmployee extends CommisonEmployee{

	
	double base;

	BasePlusEmployee(String first, String last, int ssn, double commissionRate, double weeklySales) {
		super(first, last, ssn, commissionRate, weeklySales);
		}
	BasePlusEmployee(String first, String last, int ssn, double commissionRate, double weeklySales, double base) {
		this(first, last, ssn, commissionRate, weeklySales);
		this.base = base;
		}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double weeklyEarnings() {
		return super.weeklyEarnings() + base;
	}
	
	@Override
	public String toString() {
		return "Base Plus Employee: " + getFirst() + " " + getLast() + "\n"
				+ "SSN: " + getSSN() + "\n"
				+ "Gross Sales: " + getWeeklySales() + " " + "Commission Rate: " + getCommissionRate() + " " + "Base Salary: " + base +"\n"
				+ "Weekly Earnings: " + weeklyEarnings() + "\n";
				}
	
	

}
