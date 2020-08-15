
public class CommisonEmployee extends Employee{

	
	double commissionRate, weeklySales;
	
	
	CommisonEmployee(String first, String last, int ssn) {
		super(first, last, ssn);	
	}
	CommisonEmployee(String first, String last, int ssn, double commissionRate, double weeklySales) {
		this(first, last, ssn);	
		this.commissionRate = commissionRate;
		this.weeklySales = weeklySales;
	}
	@Override
	public double weeklyEarnings() {
			return weeklySales * commissionRate;
	}
	
	public double getWeeklySales() {
		return weeklySales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public void setWeeklySales(double weeklySales) {
		this.weeklySales = weeklySales;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	public String toString() {
		
		
		return getFirst() + " " + getLast() + "\n" + "SSN: " + getSSN() + "\n"
				+ "Gross Sales: " + weeklySales + " " + "Commission rate: " + commissionRate + "\n"
				+ "Weekly earnings: " + weeklyEarnings() + "\n";
	}

}
