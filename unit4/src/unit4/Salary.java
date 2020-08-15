package unit4;

public class Salary {

	
	double pay;
	double hoursWorked;
	double overtime;
	
	
	
	
	public Salary(double pay, double hoursWorked) {
		this.pay = pay;
		this.hoursWorked = hoursWorked;
		setOvertime();
	}
	
	
	public void setOvertime() {
		if(this.hoursWorked > 40) {
			this.overtime = this.hoursWorked - 40;
		}else if(this.hoursWorked > 0 && this.hoursWorked <= 40){
			this.overtime = 0;
		}else {
			this.overtime = this.hoursWorked;
		}
	}
	
	public double getPay() {
		return this.pay;
	}
	public double getHoursWorked() {
		return this.hoursWorked;
	}
	public double getOvertime() {
		return this.overtime;
	}
	
	public double getSalary() {
		
		if(this.overtime > 0) {
			return (pay * 40) + ((pay * 1.5) * this.overtime);
		}else if(this.overtime == 0) {
			return this.pay*this.hoursWorked;
		}else {
			return 0;
		}
		
		
	}
	
	
}
