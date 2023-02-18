package multi;

public class Swiggy extends Thread {
	
	public synchronized void  run() { // Synchronized keyword will sort the order n By default it is asynchronous.
		for (int i=0;i<10;i++) {
			
			System.out.println("swiggy...."+Thread.currentThread().getName());
			
		}
	}
	
	public static void main(String[] args) {
		Swiggy s=new Swiggy();
		Thread t1=new Thread(s);
		t1.start();
		
		Thread t2=new Thread(s);
		t2.start();
	}
	

}
