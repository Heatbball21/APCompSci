
public class SalariedEmployee extends Employee{

	public double weeklySalary;
	
	SalariedEmployee(String first, String last, int ssn) {
		super(first, last, ssn);
	}
	SalariedEmployee(String first, String last, int ssn, double weeklySalary){
		this(first, last, ssn);
		this.weeklySalary = weeklySalary;
	}
	@Override
	public double weeklyEarnings() {
		
		return weeklySalary;
	}
	
	public double getWeekly() {
		return weeklySalary;
	}
	public void setWeekly(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public String toString() {
		
		
		return getFirst() + " " + getLast() + "\n" + "Social Security: " + getSSN() + "\n"
				+ "Weekly Salary: " + weeklyEarnings() + "\n" + "Weekly Earnings: " + weeklyEarnings() + "\n";
	}

	

}
