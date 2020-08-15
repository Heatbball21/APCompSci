import java.util.Scanner;

public class TempConvertTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TempConvert t = new TempConvert();
		
		
		int temp;
		System.out.println("Enter a temperature: ");
		temp = s.nextInt();
		
		char type;
		System.out.println("Enter 'f' to convert to fahrenheit or 'c' to convert to celsius");
		type = s.next().charAt(0);
		
		if(type == 'f') {
			System.out.println(t.fahrenheit(temp));
		}else if(type == 'c') {
			System.out.println(t.celsius(temp));
		}else {
			
		}
		s.close();
	}

}
