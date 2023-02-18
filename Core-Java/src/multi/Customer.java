package multi;

public class Customer {

	
	int amount=10000;
	
	public synchronized void withDraw(int amount) throws InterruptedException {
		
		System.out.println("customer came to withdraw...");
		
		
		if(this.amount<amount) {
			System.out.println("insufficient funds...please..wait..");
			wait();
			
			this.amount=this.amount-amount;
			
			System.out.println("withdrawn successfully...");
		}
	}
		
			public synchronized void deposite(int amount) {
				
				System.out.println("customer care to deposite.....");
				
				this.amount=this.amount-amount;
				
				System.out.println("deposited successfully !! ");
				
				notify();
				
			}
			
		
	
}
 