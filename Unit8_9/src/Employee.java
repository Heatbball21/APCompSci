
public abstract class Employee {

	String first, last;
	int ssn;

	
	Employee(String first, String last, int ssn) {
		this.first = first;
		this.last = last;
		this.ssn = ssn;
	}
	
	
	
	
	public String getFirst() {
		return this.first;
	}
	public String getLast() {
		return this.last;
	}
	public int getSSN() {
		return this.ssn;
	}
	
	@Override
	public String toString() {
		return this.first + " " + this.last + "\n" + "SSN: " + String.format("{0:000-00-0000}", ssn);
	}
	
	public abstract double weeklyEarnings();
	
	
}
