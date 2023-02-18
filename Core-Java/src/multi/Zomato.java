package multi;

public class Zomato implements Runnable{

	@Override
	public void run() { // RUNNING STATE
		
for (int i=0;i<10;i++) {
			
			System.out.println("zomato..."+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000); // WAIT STAGE
			} catch (InterruptedException e) {
				
				e.printStackTrace(); //DEAD STAGE
			}
			
			
           }	


	}
	public static void main(String[] args) {
		Zomato s=new Zomato();
		Thread t1=new Thread(s); // BORN STATE
		t1.start(); // RUNNABLE STATE
		
		Thread t2=new Thread(s);
		t2.start();
		// t2.start();
	}
	// ONCE WE GOT THE OUTPUT THREAD WILL GO TO DEAD STATE. 
	// AFTER THAT IF WE WANT TO PRINT THE SAME THREEAD AGAIN WE WILL GET ILLEGAL STATE EXCEPTION
	
}
