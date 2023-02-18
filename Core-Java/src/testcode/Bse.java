package testcode;

public abstract class Bse {

	public abstract void brokerage();
	
	public void stocksinfo() {
		System.out.println(" Titan stocks info");
	}
	public static void main(String[] args) {
		// Bse bs=new Bse();
	}
	
	{
		System.out.println(" instance block");
	}
	
	static {
		System.out.println(" static block");
	}
	
	public Bse() {
		
	}
	
	
}
