package testcode;

public class Upstox extends Bse {

	
	@Override
	public void brokerage() {
		System.out.println("hello ");
		
	}
public static void main(String[] args) {
		
Upstox up=new Upstox();
up.brokerage();
up.stocksinfo();

	}
}
