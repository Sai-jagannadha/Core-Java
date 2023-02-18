package oops;

public class Upstox extends BSE {

	@Override
	public void brokerage() {
		System.out.println("Brokerage is 20rupess for each transaction");
		
	}
public static void main(String[] args) {
	Upstox u=new Upstox();
	u.brokerage();
	u.Stocksinfo();
}
	
}
