
public class TempConvert {

	
	public int fahrenheit(int temp) {
		return (int)(Math.floor(1.8 * temp + 32));
	}
	public int celsius(int temp) {
		return (int)(Math.floor(.56 * (temp - 32)));
	}
	
}
