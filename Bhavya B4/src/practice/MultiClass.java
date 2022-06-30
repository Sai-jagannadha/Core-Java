package practice;



public class MultiClass extends Thread{
@Override
public synchronized void run()	{
	for(int i=0; i<10; i++) {
		System.out.println("value.."+Thread.currentThread().getName());
		
	}
}
	
	public static void main(String[] args) {
		MultiClass mt=new MultiClass();
		Thread t=new Thread(mt);
		t.start();
		
		Thread t1=new Thread(mt);
		t1.start();
		
	}
	
	
}
