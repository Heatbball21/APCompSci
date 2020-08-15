
public class EmployeeTestMain {

	static CommisonEmployee employee1;
    static BasePlusEmployee employee2;
    static HourlyEmployee employee3;
    static SalariedEmployee employee4;
	 	
	
	public static void main(String[] args) {
		
		
		
			employee1 = new CommisonEmployee("Sue", "Jones", 222222222, .06, 10000);
	        employee2 = new BasePlusEmployee("Jeff", "Michaels", 333333333, .02, 8500, 2000);
	        employee3 = new HourlyEmployee("Sarah", "Thomas", 444444444, 45, 18.50);
	        employee4 = new SalariedEmployee("Timothy", "Jones", 555555555, 2500);

	        
	        display();
	        
	        employee1.setWeeklySales(15000);
	        employee1.setCommissionRate(.04);
	        employee2.setWeeklySales(12500);
	        employee2.setCommissionRate(.03);
	        employee2.setBase(6000);
	        employee3.setWage(23.75);
	        employee3.setHours(40);
	        employee4.setWeekly(3000);
	        
	        System.out.println(employee1.toString());
	        System.out.println(employee2.toString());
	        System.out.println(employee3.toString());
	        System.out.println(employee4.toString());
	       
	}
	
	public static void display() {
		 System.out.println("EMPLOYEE 1 INFORMATION OBTAINED VIA GET METHODS");
	        System.out.println("First name: " + employee1.getFirst());
	        System.out.println("Last name: " + employee1.getLast());
	        System.out.println("Social Security Number: " + employee1.getSSN());
	        System.out.println("Gross sales: " + employee1.getWeeklySales());
	        System.out.println("Commission Rate: " + employee1.getCommissionRate());
	        System.out.println("Earnings: " + employee1.weeklyEarnings());
System.out.println("\n");
	        System.out.println("EMPLOYEE 2 INFORMATION OBTAINED BY GET METHODS");
	        System.out.println("First name: " + employee2.getFirst());
	        System.out.println("Last name: " + employee2.getLast());
	        System.out.println("Social Security Number: " + employee2.getSSN());
	        System.out.println("Gross Sales: " + employee2.getWeeklySales());
	        System.out.println("Commission Rate: " + employee2.getCommissionRate());
	        System.out.println("Base Salary: " + employee2.getBase());
	        System.out.println("Earnings: " + employee2.weeklyEarnings());
System.out.println("\n");
	        System.out.println("EMPLOYEE 3 INFORMATION OBTAINED BY GET METHODS");
	        System.out.println("First name: " + employee3.getFirst());
	        System.out.println("Last name: " + employee3.getLast());
	        System.out.println("Social Security Number: " + employee3.getSSN());
	        System.out.println("Hourly Wage: " + employee3.getWage());
	        System.out.println("Hours Worked: " + employee3.getHours());
	        System.out.println("Earnings: " + employee3.weeklyEarnings());
System.out.println("\n");
	        System.out.println("EMPLOYEE 4 INFORMATION OBTAINED BY GET METHODS");
	        System.out.println("First name: " + employee4.getFirst());
	        System.out.println("Last name: " + employee4.getLast());
	        System.out.println("Social Security Number: " + employee4.getSSN());
	        System.out.println("Weekly Salary: " + employee4.getWeekly());
	        System.out.println("Earnings: " + employee4.weeklyEarnings());
System.out.println("\n");
	}

}
