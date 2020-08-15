
public class HourlyEmployee extends Employee{

	
	double hours, wage;
	
	HourlyEmployee(String first, String last, int ssn) {
		super(first, last, ssn);
		
	}
	HourlyEmployee(String first, String last, int ssn, double hours, double wage) {
		this(first, last, ssn);
		this.hours = hours;
		this.wage = wage;
	}

	@Override
	public double weeklyEarnings() {
		if(hours > 40) {
			return 1.5 * wage * hours;
		}else {
			return wage * hours;
		}
	}
	
	public double getHours() {
		return hours;
	}
	public double getWage() {
		return wage;
	}
	
	public void setHours(double hours) {
		this.hours = hours;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	@Override
	public String toString() {
		return "Hourly Employee: " + getFirst() + " " + getLast() + "\n"
				+ "SSN: " + getSSN() + "\n"
				+ "Hourly Wage: " + wage + " Hours Worked: " + hours + "\n"
				+ "Weekly Earnings: " + weeklyEarnings() + "\n";
		}
		
}
