package testcode;

public class MultiThreading2 implements Runnable{

	@Override
	public void run() { //RUNNING
		for(int i=0;i<15;i++) {
			System.out.println("Value is....."+Thread.currentThread().getName());
		
			
			
			try {
				Thread.sleep(1000); // WAIT/SLEEP STAGE
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}synchronized (this) {
				for(int j=0;i<15;i++) {
					System.out.println("data is....."+Thread.currentThread().getName());//DEAD STATE
				
				}
			}
		}
		
		
		
		
	}
public static void main(String[] args) {
	MultiThreading2 mt2=new MultiThreading2();
	Thread t1=new Thread(mt2); //BORN
	t1.start(); //RUNNABLE
	
	Thread t2=new Thread(mt2);
	t2.start();
	
}
}
