package multi;

public class CustomerImpl {

	
		public static void main(String[] args) {
			Customer c=new Customer();
			new Thread() {
				
				public void run() {
					try {
						c.withDraw(15000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
			
			new Thread() {
				
				public void run() {
					c.deposite(10000);
					
				}
			}.start();
		}

	}

	

