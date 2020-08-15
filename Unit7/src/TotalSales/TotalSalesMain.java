package TotalSales;

import java.util.Scanner;

public class TotalSalesMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double[][] sales = new double[5][4];
		double[] salesPersonTotal = {0, 0, 0, 0};
		double[] productTotal = {0, 0, 0, 0, 0};
		
		System.out.println("Enter sales ID (5 to stop): ");
		int person = s.nextInt();
		
		while(person != 5) {
			
			System.out.println("Enter product number: ");
			int product = s.nextInt();
			
			System.out.println("Enter the amount of sales: ");
			double amount = s.nextInt();
			
			if(person >=1 && person <5 && product >=1 && product <6 && amount >=0) {
				sales[product -1][person -1] += amount;
			}else {
				System.out.println("ERROR");
			}
			
			System.out.println("Enter sales ID (5 to stop): ");
			person = s.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j<5; j++) {
				
				salesPersonTotal[i] += sales[j][i];

			}
			
		}
		
		for(int l = 0; l < 5; l++){
			for(int k = 0; k < 4; k++) {
				
				productTotal[l] += sales[l][k];
				
			}
			
		}
		
		
		double finalTotal = 0;
		
		for(int z = 0; z < 4; z++) {
			finalTotal += salesPersonTotal[z];
		}
		
		//first attempt at using place holders not the best looking
		System.out.printf("%13s%5s%5s%5s%5s%9s\n", "Sales ID  | ", "1", "2", "3", "4", " Total");
		System.out.printf("%13s%5s%5s%5s%5s%7s\n", "Product 1 | ", sales[0][0], sales[0][1], sales[0][2], sales[0][3], productTotal[0]);
		System.out.printf("%13s%5s%5s%5s%5s%7s\n", "Product 2 | ", sales[1][0], sales[1][1], sales[1][2], sales[1][3], productTotal[1]);
		System.out.printf("%13s%5s%5s%5s%5s%7s\n", "Product 3 | ", sales[2][0], sales[2][1], sales[2][2], sales[2][3], productTotal[2]);
		System.out.printf("%13s%5s%5s%5s%5s%7s\n", "Product 4 | ", sales[3][0], sales[3][1], sales[3][2], sales[3][3], productTotal[3]);
		System.out.printf("%13s%5s%5s%5s%5s%7s\n", "Product 5 | ", sales[4][0], sales[4][1], sales[4][2], sales[4][3], productTotal[4]);
		System.out.printf("\n%13s%5s%5s%5s%5s%6s", "Total     | ", salesPersonTotal[0], salesPersonTotal[1], salesPersonTotal[2], salesPersonTotal[3], finalTotal);
		
		
		s.close();
	}
}
