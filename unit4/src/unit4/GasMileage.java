package unit4;



public class GasMileage {

	
	double totalGallons;
	double totalMiles;
	
	
	public double getTrip(int miles, int gallons) {
		
		this.totalGallons += gallons;
		this.totalMiles += miles;
		
		return (miles / gallons);
	}
	
	public double getTotal() {
		return (this.totalMiles / this.totalGallons);
	}
	
	public double getGallons() {
		return this.totalGallons;
	}
	public double getMiles() {
		return this.totalMiles;
	}
	
	
}
