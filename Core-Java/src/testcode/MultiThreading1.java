package testcode;

public class MultiThreading1 extends Thread{
	
@Override


public synchronized void run()	{
	for(int i=0; i<10; i++) {
		System.out.println("value.."+Thread.currentThread().getName());
		
	}
}
	
	public static void main(String[] args) {
		MultiThreading1 mt=new MultiThreading1();
		Thread t=new Thread(mt);
		t.start();
		
		Thread t1=new Thread(mt);
		t1.start();
		
	}
	
	
}
