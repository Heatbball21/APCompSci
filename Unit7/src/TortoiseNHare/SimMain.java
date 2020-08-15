package TortoiseNHare;

public class SimMain {

	
	static TortoiseHandler t = new TortoiseHandler();
	static HareHandler h = new HareHandler();
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		t.createPos();
		h.createPos();
		t.displayMove();
		h.displayMove();
		
		gameLoop();
		
	}
	
	public static void gameLoop() throws InterruptedException {
		
		if(t.currentPos < 69 && h.currentPos < 69) {
		Thread.sleep(1000);
		//System.out.println("Running");
		
		System.out.println("\n");
		h.turn();
		t.turn();
		System.out.println("\n\n\n");
		
		
		
		gameLoop();
		}else {
			
			if(t.currentPos == 69) {
				System.out.println("\n\n\nTHE WINNER IS THE .............");
				Thread.sleep(2000);
				System.out.println("TORTOISE");
				System.exit(0);
			}else if(h.currentPos == 69) {
				System.out.println("\n\n\nTHE WINNER IS THE .............");
				Thread.sleep(2000);
				System.out.println("HARE");
				System.exit(0);
			}
			
			
			
			
		}
	}

}
