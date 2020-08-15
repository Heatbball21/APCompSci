import java.text.DecimalFormat;
import java.util.Scanner;

public class interest {

	
	double principle;

	double compInterest;
	
	public static void main(String[] args) {
	
		interest t = new interest();
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		
		t.setPrinciple("Enter principle: ", s);
		
		for (int year = 1; year<11; year++) {
		for(double i = 0.05; i<.11; i+=.010) {
			
			System.out.println("Year(s): " + year + "--Total after interest rate-- " + df.format(i) + ": " + df.format(t.calcInterest(i, year)));
		
		}
		
		}

	}
	
	
	public double calcInterest(double rate, int year){
		
		
		return (this.principle * (Math.pow(1.0 + rate, year)));
		
		
		
		
	}
	
	
	
	public double setPrinciple(String str, Scanner s) {
		System.out.println(str);
		return this.principle = s.nextDouble();
	}

}
