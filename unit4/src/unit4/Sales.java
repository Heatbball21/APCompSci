package unit4;
import java.util.HashMap;


public class Sales {

	HashMap<String, Double> ItemPrice = new HashMap<String, Double>();
	int item1, item2, item3, item4;
	
	public Sales(int item1, int item2, int item3, int item4) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
	}
	
	public double getTotalItem1() {
		return (239.99)*this.item1;
	}
	public double getTotalItem2() {
		return (129.75)*this.item2;
	}
	public double getTotalItem3() {
		return (99.95)*this.item3;
	}
	public double getTotalItem4() {
		return (350.89)*this.item4;
	}
	
	public void getItemPrices() {
		ItemPrice.put("Item1", 239.99);
		ItemPrice.put("Item2", 129.75);
		ItemPrice.put("Item3", 99.95);
		ItemPrice.put("Item4", 350.89);
		
		System.out.println(ItemPrice);
	}
	
	public double getEarnings() {
		
		
		return (.9) * (getTotalItem1() + getTotalItem2() + getTotalItem3() + getTotalItem4()) + 200;
	}
	
	public int totalSold() {
		return this.item1 + this.item2 + this.item3 + this.item4;
	}
	
}
